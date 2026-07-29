package com.nabobery.sdkgen.generated.stripe

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

@Serializable
public data class ThreeDSecureUsageView(
  public val supported: Boolean,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/three_d_secure_usage
 */
@Serializable(with = ThreeDSecureUsage.Serializer::class)
public class ThreeDSecureUsage(
  /**
   * Whether 3D Secure is supported on this card.
   */
  public val supported: Boolean,
) {
  public class Builder {
    private var supportedValue: Boolean? = null

    public var supported: Boolean
      get() = requireNotNull(supportedValue) { "supported is required" }
      set(`value`) {
        supportedValue = value
      }

    public fun build(): ThreeDSecureUsage {
      check(supportedValue != null) { "supported is required" }
      return ThreeDSecureUsage(
        supported = supported,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ThreeDSecureUsage = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<ThreeDSecureUsage> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ThreeDSecureUsage {
      val jsonDecoder = decoder.requireJsonDecoder("ThreeDSecureUsage")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ThreeDSecureUsage must be a JSON object")
      val supported = json.decodeRequired<Boolean>(rawObject, "supported")
      return ThreeDSecureUsage(
        supported = supported,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ThreeDSecureUsage) {
      val jsonEncoder = encoder.requireJsonEncoder("ThreeDSecureUsage")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("supported", json.encodeToJsonElement(value.supported))
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun threeDSecureUsage(block: ThreeDSecureUsage.Builder.() -> Unit): ThreeDSecureUsage = ThreeDSecureUsage.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ThreeDSecureUsage is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
