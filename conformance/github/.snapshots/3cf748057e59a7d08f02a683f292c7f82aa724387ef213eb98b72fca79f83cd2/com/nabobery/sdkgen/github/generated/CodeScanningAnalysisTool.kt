package com.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/code-scanning-analysis-tool.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-scanning-analysis-tool
 */
@Serializable(with = CodeScanningAnalysisTool.Serializer::class)
public class CodeScanningAnalysisTool(
  public val guid: String? = null,
  public val name: String? = null,
  public val version: String? = null,
) {
  public class Builder {
    public var guid: String? = null

    public var name: String? = null

    public var version: String? = null

    public fun build(): CodeScanningAnalysisTool = CodeScanningAnalysisTool(
      guid = guid,
      name = name,
      version = version,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): CodeScanningAnalysisTool = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<CodeScanningAnalysisTool> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeScanningAnalysisTool {
      val jsonDecoder = decoder.requireJsonDecoder("CodeScanningAnalysisTool")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("CodeScanningAnalysisTool must be a JSON object")
      return CodeScanningAnalysisTool(
        guid = rawObject["guid"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        name = rawObject["name"]?.let { json.decodeFromJsonElement<String>(it) },
        version = rawObject["version"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: CodeScanningAnalysisTool) {
      val jsonEncoder = encoder.requireJsonEncoder("CodeScanningAnalysisTool")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.guid?.let { put("guid", it) }
        value.name?.let { put("name", it) }
        value.version?.let { put("version", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun codeScanningAnalysisTool(block: CodeScanningAnalysisTool.Builder.() -> Unit): CodeScanningAnalysisTool = CodeScanningAnalysisTool.build(block)
