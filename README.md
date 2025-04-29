# Bar Chart Visualization System

## Comprehensive Data Visualization Toolkit

This system provides a complete solution for creating static and animated bar charts from various datasets. It consists of three main components:

### 1. Bar Data Type (`Bar.java`)
**Core Functionality**:
- Represents individual bars with name, value, and category attributes
- Implements `Comparable<Bar>` for sorting by value
- Includes validation for negative values and null fields

**Key Methods**:
- `getName()`, `getValue()`, `getCategory()` - Access bar properties
- `compareTo()` - Enables sorting by value (ascending/descending)
- Constructor validation - Ensures data integrity

### 2. Static Bar Chart (`BarChart.java`)
**Visualization Features**:
- Creates labeled bar charts with customizable titles
- Supports multiple categories with distinct colors
- Handles dynamic addition of bars
- Includes caption support for additional context

**Usage Example**:
```java
BarChart chart = new BarChart("Top Cities", "Population", "UN Data");
chart.add("Tokyo", 38194, "East Asia");
chart.add("Delhi", 27890, "South Asia");
chart.draw();
```

### 3. Bar Chart Racer (Animation System)
**Dynamic Visualization**:
- Processes time-series data files
- Generates animated transitions between states
- Configurable number of displayed bars
- Supports various datasets (cities, countries, brands, etc.)

**Data File Format**:
1. Header (title, x-axis label, data source)
2. Blank line separator
3. Grouped records by time period:
   - Group size indicator
   - Comma-separated values (date, name, country, value, category)
   - Blank line separators

**Supported Datasets**:
- Population trends (cities/countries)
- Brand valuations
- Movie box office records
- Baby name popularity
- Sports team rankings
- Film character screen time

## System Requirements

- Java 8 or higher
- Standard Draw library (for visualization)
- Data files in specified format

## Example Usage

```bash
# Generate city population animation (top 10 cities)
java BarChartRacer cities.txt 10
```
<video  poster="cities.png" id="WorldCities" src="cities.mp4" width = 350 controls="true"></video>

```bash
# Create brand valuation chart (top 15 brands)
java BarChartRacer brands.txt 15
```
<video  poster="brands.png" id="GlobalBrands" src="brands.mp4" width = 350 controls="true"></video>

## Advanced Features

- **Audio Support**: Optional soundtrack integration
- **Customization**: Adjustable canvas size and display parameters
- **Efficient Rendering**: Uses double buffering for smooth animations
- **Data Validation**: Handles malformed input gracefully

## Applications

- Demographic trend visualization
- Business intelligence dashboards
- Historical data analysis
- Educational presentations
- Competitive ranking displays

Note: The system is designed for medium-sized datasets and may require optimization for extremely large datasets or high frame-rate animations.
