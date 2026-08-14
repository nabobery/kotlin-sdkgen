package io.github.nabobery.sdkgen.generated

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools/anyOf/1.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/McpServerTool/properties/allowed_tools/anyOf/1
 */
@Serializable(with = InlineMcpServerToolAllowedToolsAnyOf2X94107112.Serializer::class)
public class InlineMcpServerToolAllowedToolsAnyOf2X94107112(
  public val readOnly: Boolean? = null,
  toolNames: List<String>? = null,
) {
  public val toolNames: List<String>? = toolNames?.let { collection0 -> collection0.toList() }

  public class Builder {
    public var readOnly: Boolean? = null

    private var toolNamesValue: List<String>? = null

    public var toolNames: List<String>?
      get() = toolNamesValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        toolNamesValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): InlineMcpServerToolAllowedToolsAnyOf2X94107112 = InlineMcpServerToolAllowedToolsAnyOf2X94107112(
      readOnly = readOnly,
      toolNames = toolNames,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineMcpServerToolAllowedToolsAnyOf2X94107112 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineMcpServerToolAllowedToolsAnyOf2X94107112> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineMcpServerToolAllowedToolsAnyOf2X94107112 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineMcpServerToolAllowedToolsAnyOf2X94107112")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineMcpServerToolAllowedToolsAnyOf2X94107112 must be a JSON object")
      return InlineMcpServerToolAllowedToolsAnyOf2X94107112(
        readOnly = rawObject["read_only"]?.let { json.decodeFromJsonElement<Boolean>(it) },
        toolNames = rawObject["tool_names"]?.let { json.decodeFromJsonElement<List<String>>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineMcpServerToolAllowedToolsAnyOf2X94107112) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineMcpServerToolAllowedToolsAnyOf2X94107112")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.readOnly?.let { put("read_only", json.encodeToJsonElement(it)) }
        value.toolNames?.let { put("tool_names", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineMcpServerToolAllowedToolsAnyOf2X94107112(block: InlineMcpServerToolAllowedToolsAnyOf2X94107112.Builder.() -> Unit): InlineMcpServerToolAllowedToolsAnyOf2X94107112 = InlineMcpServerToolAllowedToolsAnyOf2X94107112.build(block)
