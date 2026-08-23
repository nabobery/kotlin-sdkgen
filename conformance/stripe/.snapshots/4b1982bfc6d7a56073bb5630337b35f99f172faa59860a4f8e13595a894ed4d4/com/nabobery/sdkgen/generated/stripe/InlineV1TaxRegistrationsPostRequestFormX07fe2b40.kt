package com.nabobery.sdkgen.generated.stripe

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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1registrations~1{id}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema
 */
@Serializable(with = InlineV1TaxRegistrationsPostRequestFormX07fe2b40.Serializer::class)
public class InlineV1TaxRegistrationsPostRequestFormX07fe2b40(
  /**
   * Time at which the registration becomes active. It can be either `now` to indicate the current time, or a timestamp
   * measured in seconds since the Unix epoch.
   */
  public val activeFrom: InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b? = null,
  expand: List<String>? = null,
  /**
   * If set, the registration stops being active at this time. If not set, the registration will be active indefinitely.
   * It can be either `now` to indicate the current time, or a timestamp measured in seconds since the Unix epoch.
   */
  public val expiresAt: InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * Time at which the registration becomes active. It can be either `now` to indicate the current time, or a
     * timestamp measured in seconds since the Unix epoch.
     */
    public var activeFrom: InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * If set, the registration stops being active at this time. If not set, the registration will be active
     * indefinitely. It can be either `now` to indicate the current time, or a timestamp measured in seconds since the
     * Unix epoch.
     */
    public var expiresAt: InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703? = null

    public fun build(): InlineV1TaxRegistrationsPostRequestFormX07fe2b40 = InlineV1TaxRegistrationsPostRequestFormX07fe2b40(
      activeFrom = activeFrom,
      expand = expand,
      expiresAt = expiresAt,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormX07fe2b40 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TaxRegistrationsPostRequestFormX07fe2b40> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxRegistrationsPostRequestFormX07fe2b40 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxRegistrationsPostRequestFormX07fe2b40")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TaxRegistrationsPostRequestFormX07fe2b40 must be a JSON object")
      return InlineV1TaxRegistrationsPostRequestFormX07fe2b40(
        activeFrom = rawObject["active_from"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormActiveFromXf72e779b>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        expiresAt = rawObject["expires_at"]?.let { json.decodeFromJsonElement<InlineV1TaxRegistrationsPostRequestFormExpiresAtX2d54e703>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxRegistrationsPostRequestFormX07fe2b40) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TaxRegistrationsPostRequestFormX07fe2b40")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.activeFrom?.let { put("active_from", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.expiresAt?.let { put("expires_at", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TaxRegistrationsPostRequestFormX07fe2b40(block: InlineV1TaxRegistrationsPostRequestFormX07fe2b40.Builder.() -> Unit): InlineV1TaxRegistrationsPostRequestFormX07fe2b40 = InlineV1TaxRegistrationsPostRequestFormX07fe2b40.build(block)
