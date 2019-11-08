from flask import Flask, render_template, request

app = Flask(__name__)


@app.route('/')
def main():
    return render_template('index.html')

@app.route('/search', methods=['GET', 'POST'])
def search():
    temp = request.args.get('id')
    List = ['알타리무', '상추', '배추', '깻잎', '무', '고추']
    if temp in List:
        return render_template('Test.html', data = temp)
    else:
        return render_template('error.html')

@app.route('/상추')
def 상추():
    return render_template('상추.html')
@app.route('/배추')
def 배추():
    return render_template('배추.html')
@app.route('/무')
def 무():
    return render_template('무.html')
@app.route('/고추')
def 고추():
    return render_template('고추.html')
@app.route('/깻잎')
def 깻잎():
    return render_template('깻잎.html')
@app.route('/알타리무')
def 알타리무():
    return render_template('알타리무.html')

if __name__ == '__main__':
    app.run()
