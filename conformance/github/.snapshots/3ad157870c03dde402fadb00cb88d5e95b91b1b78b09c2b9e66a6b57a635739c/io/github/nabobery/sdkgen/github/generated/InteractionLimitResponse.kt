package io.github.nabobery.sdkgen.github.generated

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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
public data class InteractionLimitResponseView(
  @SerialName("expires_at")
  public val expiresAt: String,
  public val limit: InteractionGroup,
  public val origin: String,
)

/**
 * Interaction limit settings.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/interaction-limit-response
 */
@Serializable(with = InteractionLimitResponse.Serializer::class)
public class InteractionLimitResponse(
  /**
   * Wire format: `date-time`. Represented as `String` in this release; SDKGen does not validate this format.
   */
  public val expiresAt: String,
  public val limit: InteractionGroup,
  public val origin: String,
) {
  public class Builder {
    private var expiresAtValue: String? = null

    public var expiresAt: String
      get() = requireNotNull(expiresAtValue) { "expiresAt is required" }
      set(`value`) {
        expiresAtValue = value
      }

    private var limitValue: InteractionGroup? = null

    public var limit: InteractionGroup
      get() = requireNotNull(limitValue) { "limit is required" }
      set(`value`) {
        limitValue = value
      }

    private var originValue: String? = null

    public var origin: String
      get() = requireNotNull(originValue) { "origin is required" }
      set(`value`) {
        originValue = value
      }

    public fun build(): InteractionLimitResponse {
      check(expiresAtValue != null) { "expiresAt is required" }
      check(limitValue != null) { "limit is required" }
      check(originValue != null) { "origin is required" }
      return InteractionLimitResponse(
        expiresAt = expiresAt,
        limit = limit,
        origin = origin,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InteractionLimitResponse = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InteractionLimitResponse> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InteractionLimitResponse {
      val jsonDecoder = decoder.requireJsonDecoder("InteractionLimitResponse")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InteractionLimitResponse must be a JSON object")
      val expiresAt = json.decodeRequired<String>(rawObject, "expires_at")
      val limit = json.decodeRequired<InteractionGroup>(rawObject, "limit")
      val origin = json.decodeRequired<String>(rawObject, "origin")
      return InteractionLimitResponse(
        expiresAt = expiresAt,
        limit = limit,
        origin = origin,
      )
    }

    override fun serialize(encoder: Encoder, `value`: InteractionLimitResponse) {
      val jsonEncoder = encoder.requireJsonEncoder("InteractionLimitResponse")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("expires_at", value.expiresAt)
        put("limit", json.encodeToJsonElement(value.limit))
        put("origin", value.origin)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun interactionLimitResponse(block: InteractionLimitResponse.Builder.() -> Unit): InteractionLimitResponse = InteractionLimitResponse.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InteractionLimitResponse is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
