package com.nabobery.sdkgen.generated

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
 * Generated model for sdkgen://source/openapi.yaml#/components/schemas/RouterAttempt.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/RouterAttempt
 */
@Serializable(with = RouterAttempt.Serializer::class)
public class RouterAttempt(
  public val model: String,
  public val provider: String,
  public val status: Int,
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

    private var statusValue: Int? = null

    public var status: Int
      get() = requireNotNull(statusValue) { "status is required" }
      set(`value`) {
        statusValue = value
      }

    public fun build(): RouterAttempt {
      check(modelValue != null) { "model is required" }
      check(providerValue != null) { "provider is required" }
      check(statusValue != null) { "status is required" }
      return RouterAttempt(
        model = model,
        provider = provider,
        status = status,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): RouterAttempt = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<RouterAttempt> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): RouterAttempt {
      val jsonDecoder = decoder.requireJsonDecoder("RouterAttempt")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("RouterAttempt must be a JSON object")
      val model = json.decodeRequired<String>(rawObject, "model")
      val provider = json.decodeRequired<String>(rawObject, "provider")
      val status = json.decodeRequired<Int>(rawObject, "status")
      return RouterAttempt(
        model = model,
        provider = provider,
        status = status,
      )
    }

    override fun serialize(encoder: Encoder, `value`: RouterAttempt) {
      val jsonEncoder = encoder.requireJsonEncoder("RouterAttempt")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("model", value.model)
        put("provider", value.provider)
        put("status", json.encodeToJsonElement(value.status))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun routerAttempt(block: RouterAttempt.Builder.() -> Unit): RouterAttempt = RouterAttempt.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("RouterAttempt is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
