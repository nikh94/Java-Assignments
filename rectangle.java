package exercise9_1;


	public class rectangle
	{
		private double width;
		private double height;
		private String signal;

		rectangle ()
		{
			width=1.0;
			height=1.0;
			signal="";
		}

		rectangle(double _width,double _height) throws Exception
		{
			setHeight(_height);
			setWidth(_width);
		}


		public void setWidth(double _width) throws Exception
		{
			if(!isValidWidth(_width))

			{
				signal = "Invalid width entered. Width should be greater than 0";
				Exception e = new Exception(signal);
				throw e;
			}
			width=_width;
		}

		public void setHeight(double _height) throws Exception
		{
			if(!isValidHeight(_height))
			{
				signal = "Invalid height ";
				Exception e = new Exception(signal);
				throw e;
			}
			height=_height;
		}

		public boolean isValidWidth(double _width)
		{
			if(_width>0)
				return true;
			else
				return false;
		}

		public boolean isValidHeight(double _height)
		{
			if(_height>0)
				return true;
			else
				return false;
		}

		public double getWidth()
		{
			return width;
		}
		public double getHeight()
		{
			return height;
		}
		public double getArea()
		{
			return width*height;
		}
		public double getPerimeter()
		{
			return 2*(width+height);

		}

	}



