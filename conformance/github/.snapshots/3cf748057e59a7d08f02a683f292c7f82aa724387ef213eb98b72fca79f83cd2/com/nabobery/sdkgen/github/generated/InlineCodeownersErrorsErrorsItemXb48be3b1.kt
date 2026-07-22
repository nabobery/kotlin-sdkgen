package com.nabobery.sdkgen.github.generated

import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/codeowners-errors/properties/errors/items.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/codeowners-errors/properties/errors/items
 */
@Serializable(with = InlineCodeownersErrorsErrorsItemXb48be3b1.Serializer::class)
public class InlineCodeownersErrorsErrorsItemXb48be3b1(
  /**
   * The column number where this errors occurs.
   */
  public val column: Int,
  /**
   * The type of error.
   */
  public val kind: String,
  /**
   * The line number where this errors occurs.
   */
  public val line: Int,
  /**
   * A human-readable description of the error, combining information from multiple fields, laid out for display in a
   * monospaced typeface (for example, a command-line setting).
   */
  public val message: String,
  /**
   * The path of the file where the error occured.
   */
  public val path: String,
  /**
   * The contents of the line where the error occurs.
   */
  public val source: String? = null,
  /**
   * Suggested action to fix the error. This will usually be `null`, but is provided for some common errors.
   */
  public val suggestion: String? = null,
) {
  public class Builder {
    private var columnValue: Int? = null

    public var column: Int
      get() = requireNotNull(columnValue) { "column is required" }
      set(`value`) {
        columnValue = value
      }

    private var kindValue: String? = null

    public var kind: String
      get() = requireNotNull(kindValue) { "kind is required" }
      set(`value`) {
        kindValue = value
      }

    private var lineValue: Int? = null

    public var line: Int
      get() = requireNotNull(lineValue) { "line is required" }
      set(`value`) {
        lineValue = value
      }

    private var messageValue: String? = null

    public var message: String
      get() = requireNotNull(messageValue) { "message is required" }
      set(`value`) {
        messageValue = value
      }

    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    /**
     * The contents of the line where the error occurs.
     */
    public var source: String? = null

    /**
     * Suggested action to fix the error. This will usually be `null`, but is provided for some common errors.
     */
    public var suggestion: String? = null

    public fun build(): InlineCodeownersErrorsErrorsItemXb48be3b1 {
      check(columnValue != null) { "column is required" }
      check(kindValue != null) { "kind is required" }
      check(lineValue != null) { "line is required" }
      check(messageValue != null) { "message is required" }
      check(pathValue != null) { "path is required" }
      return InlineCodeownersErrorsErrorsItemXb48be3b1(
        column = column,
        kind = kind,
        line = line,
        message = message,
        path = path,
        source = source,
        suggestion = suggestion,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineCodeownersErrorsErrorsItemXb48be3b1 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineCodeownersErrorsErrorsItemXb48be3b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCodeownersErrorsErrorsItemXb48be3b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCodeownersErrorsErrorsItemXb48be3b1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineCodeownersErrorsErrorsItemXb48be3b1 must be a JSON object")
      val column = json.decodeRequired<Int>(rawObject, "column")
      val kind = json.decodeRequired<String>(rawObject, "kind")
      val line = json.decodeRequired<Int>(rawObject, "line")
      val message = json.decodeRequired<String>(rawObject, "message")
      val path = json.decodeRequired<String>(rawObject, "path")
      return InlineCodeownersErrorsErrorsItemXb48be3b1(
        column = column,
        kind = kind,
        line = line,
        message = message,
        path = path,
        source = rawObject["source"]?.let { json.decodeFromJsonElement<String>(it) },
        suggestion = rawObject["suggestion"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineCodeownersErrorsErrorsItemXb48be3b1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineCodeownersErrorsErrorsItemXb48be3b1")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("column", json.encodeToJsonElement(value.column))
        put("kind", value.kind)
        put("line", json.encodeToJsonElement(value.line))
        put("message", value.message)
        put("path", value.path)
        value.source?.let { put("source", it) }
        value.suggestion?.let { put("suggestion", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineCodeownersErrorsErrorsItemXb48be3b1(block: InlineCodeownersErrorsErrorsItemXb48be3b1.Builder.() -> Unit): InlineCodeownersErrorsErrorsItemXb48be3b1 = InlineCodeownersErrorsErrorsItemXb48be3b1.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineCodeownersErrorsErrorsItemXb48be3b1 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
