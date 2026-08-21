package com.nabobery.sdkgen.generated

import kotlin.Boolean
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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/ResponseHealingPlugin.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/ResponseHealingPlugin
 */
@Serializable(with = ResponseHealingPlugin.Serializer::class)
public class ResponseHealingPlugin(
  public val id: InlineResponseHealingPluginIdX79023015,
  /**
   * Set to false to disable the response-healing plugin for this request. Defaults to true.
   */
  public val enabled: Boolean? = null,
) {
  public class Builder {
    private var idValue: InlineResponseHealingPluginIdX79023015? = null

    public var id: InlineResponseHealingPluginIdX79023015
      get() = requireNotNull(idValue) { "id is required" }
      set(`value`) {
        idValue = value
      }

    /**
     * Set to false to disable the response-healing plugin for this request. Defaults to true.
     */
    public var enabled: Boolean? = null

    public fun build(): ResponseHealingPlugin {
      check(idValue != null) { "id is required" }
      return ResponseHealingPlugin(
        id = id,
        enabled = enabled,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ResponseHealingPlugin = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ResponseHealingPlugin> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ResponseHealingPlugin {
      val jsonDecoder = decoder.requireJsonDecoder("ResponseHealingPlugin")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ResponseHealingPlugin must be a JSON object")
      val id = json.decodeRequired<InlineResponseHealingPluginIdX79023015>(rawObject, "id")
      return ResponseHealingPlugin(
        id = id,
        enabled = rawObject["enabled"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: ResponseHealingPlugin) {
      val jsonEncoder = encoder.requireJsonEncoder("ResponseHealingPlugin")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("id", json.encodeToJsonElement(value.id))
        value.enabled?.let { put("enabled", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun responseHealingPlugin(block: ResponseHealingPlugin.Builder.() -> Unit): ResponseHealingPlugin = ResponseHealingPlugin.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ResponseHealingPlugin is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
