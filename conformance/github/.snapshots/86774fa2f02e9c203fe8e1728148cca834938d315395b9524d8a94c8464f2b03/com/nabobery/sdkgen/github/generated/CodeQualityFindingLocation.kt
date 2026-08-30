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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Code quality file location
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-finding-location
 */
@Serializable(with = CodeQualityFindingLocation.Serializer::class)
public class CodeQualityFindingLocation(
  /**
   * The file path where the finding was detected.
   */
  public val path: String,
  /**
   * The column number where the finding ends.
   */
  public val endColumn: Int? = null,
  /**
   * The line number where the finding ends.
   */
  public val endLine: Int? = null,
  /**
   * The column number where the finding starts.
   */
  public val startColumn: Int? = null,
  /**
   * The line number where the finding starts.
   */
  public val startLine: Int? = null,
) {
  public class Builder {
    private var pathValue: String? = null

    public var path: String
      get() = requireNotNull(pathValue) { "path is required" }
      set(`value`) {
        pathValue = value
      }

    /**
     * The column number where the finding ends.
     */
    public var endColumn: Int? = null

    /**
     * The line number where the finding ends.
     */
    public var endLine: Int? = null

    /**
     * The column number where the finding starts.
     */
    public var startColumn: Int? = null

    /**
     * The line number where the finding starts.
     */
    public var startLine: Int? = null

    public fun build(): CodeQualityFindingLocation {
      check(pathValue != null) { "path is required" }
      return CodeQualityFindingLocation(
        path = path,
        endColumn = endColumn,
        endLine = endLine,
        startColumn = startColumn,
        startLine = startLine,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeQualityFindingLocation = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<CodeQualityFindingLocation> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualityFindingLocation {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualityFindingLocation")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeQualityFindingLocation must be a JSON object")
      val path = json.decodeRequired<String>(rawObject, "path")
      return CodeQualityFindingLocation(
        path = path,
        endColumn = rawObject["end_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        endLine = rawObject["end_line"]?.let { json.decodeFromJsonElement<Int>(it) },
        startColumn = rawObject["start_column"]?.let { json.decodeFromJsonElement<Int>(it) },
        startLine = rawObject["start_line"]?.let { json.decodeFromJsonElement<Int>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualityFindingLocation) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeQualityFindingLocation")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("path", value.path)
        value.endColumn?.let { put("end_column", json.encodeToJsonElement(it)) }
        value.endLine?.let { put("end_line", json.encodeToJsonElement(it)) }
        value.startColumn?.let { put("start_column", json.encodeToJsonElement(it)) }
        value.startLine?.let { put("start_line", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeQualityFindingLocation(block: CodeQualityFindingLocation.Builder.() -> Unit): CodeQualityFindingLocation = CodeQualityFindingLocation.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("CodeQualityFindingLocation is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
