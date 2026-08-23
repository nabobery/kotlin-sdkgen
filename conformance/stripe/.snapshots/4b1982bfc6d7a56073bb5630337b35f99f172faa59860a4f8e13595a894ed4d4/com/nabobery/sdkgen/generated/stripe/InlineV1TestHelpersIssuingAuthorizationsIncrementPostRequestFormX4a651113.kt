package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
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
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1increment/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1test_helpers~1issuing~1authorizations~1{authorization}~1increment/post/requ
 * estBody/content/application~1x-www-form-urlencoded/schema
 */
@Serializable(with = InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113.Serializer::class)
public class InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113(
  /**
   * The amount to increment the authorization by. This amount is in the authorization currency and in the [smallest
   * currency unit](https://docs.stripe.com/currencies#zero-decimal).
   */
  public val incrementAmount: Int,
  expand: List<String>? = null,
  /**
   * If set `true`, you may provide
   * [amount](https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount) to
   * control how much to hold for the authorization.
   */
  public val isAmountControllable: Boolean? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var incrementAmountValue: Int? = null

    public var incrementAmount: Int
      get() = requireNotNull(incrementAmountValue) { "incrementAmount is required" }
      set(`value`) {
        incrementAmountValue = value
      }

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
     * If set `true`, you may provide
     * [amount](https://docs.stripe.com/api/issuing/authorizations/approve#approve_issuing_authorization-amount) to
     * control how much to hold for the authorization.
     */
    public var isAmountControllable: Boolean? = null

    public fun build(): InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 {
      check(incrementAmountValue != null) { "incrementAmount is required" }
      return InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113(
        incrementAmount = incrementAmount,
        expand = expand,
        isAmountControllable = isAmountControllable,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 must be a JSON object")
      val incrementAmount = json.decodeRequired<Int>(rawObject, "increment_amount")
      return InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113(
        incrementAmount = incrementAmount,
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        isAmountControllable = rawObject["is_amount_controllable"]?.let { json.decodeFromJsonElement<Boolean>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("increment_amount", json.encodeToJsonElement(value.incrementAmount))
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.isAmountControllable?.let { put("is_amount_controllable", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113(block: InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113.Builder.() -> Unit): InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 = InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("InlineV1TestHelpersIssuingAuthorizationsIncrementPostRequestFormX4a651113 is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
