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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/EndpointInfo.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/EndpointInfo
 */
@Serializable(with = EndpointInfo.Serializer::class)
public class EndpointInfo(
  public val model: String,
  public val provider: String,
  public val selected: Boolean,
) {
  public class Builder {
    private var modelValue: String? = null

    public var model: String
      get() = requireNotNull(modelValue) { "model is required" }
      set(`value`) {
        modelValue = value
      }

    private var providerValue: String? = null

    public var provider: String
      get() = requireNotNull(providerValue) { "provider is required" }
      set(`value`) {
        providerValue = value
      }

    private var selectedValue: Boolean? = null

    public var selected: Boolean
      get() = requireNotNull(selectedValue) { "selected is required" }
      set(`value`) {
        selectedValue = value
      }

    public fun build(): EndpointInfo {
      check(modelValue != null) { "model is required" }
      check(providerValue != null) { "provider is required" }
      check(selectedValue != null) { "selected is required" }
      return EndpointInfo(
        model = model,
        provider = provider,
        selected = selected,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): EndpointInfo = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<EndpointInfo> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): EndpointInfo {
      val jsonDecoder = decoder.requireJsonDecoder("EndpointInfo")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("EndpointInfo must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val provider = json.decodeRequired<String>(rawObject, "provider")
      val selected = json.decodeRequired<Boolean>(rawObject, "selected")
      return EndpointInfo(
        model = model,
        provider = provider,
        selected = selected,
      )
    }

    override fun serialize(encoder: Encoder, `value`: EndpointInfo) {
      val jsonEncoder = encoder.requireJsonEncoder("EndpointInfo")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("provider", value.provider)
        put("selected", json.encodeToJsonElement(value.selected))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun endpointInfo(block: EndpointInfo.Builder.() -> Unit): EndpointInfo = EndpointInfo.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("EndpointInfo is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
