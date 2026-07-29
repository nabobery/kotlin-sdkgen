package com.nabobery.sdkgen.generated.stripe

import kotlin.Boolean
import kotlin.Int
import kotlin.LazyThreadSafetyMode
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Set
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineCheckoutSessionSubscriptionXd0282245Branch {
  Branch1,
  Subscription,
}

public sealed class InlineCheckoutSessionSubscriptionXd0282245DecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionSubscriptionXd0282245NoMatchException(
  message: String,
) : InlineCheckoutSessionSubscriptionXd0282245DecodingException(message)

internal data class InlineCheckoutSessionSubscriptionXd0282245Inspection(
  public val matchesBranch1: Boolean,
  public val matchesSubscription: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSubscription).count { it }
}

/**
 * The ID of the [Subscription](https://docs.stripe.com/api/subscriptions) for Checkout Sessions in `subscription` mode.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/subscription
 */
@Serializable(with = InlineCheckoutSessionSubscriptionXd0282245.Serializer::class)
public class InlineCheckoutSessionSubscriptionXd0282245 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionSubscriptionXd0282245Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val subscription: Subscription? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSubscription) json.decodeFromJsonElement<Subscription>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionSubscriptionXd0282245Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCheckoutSessionSubscriptionXd0282245Branch.Branch1)
      if (inspection.matchesSubscription) add(InlineCheckoutSessionSubscriptionXd0282245Branch.Subscription)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionSubscriptionXd0282245 {
      val inspection = inspectInlineCheckoutSessionSubscriptionXd0282245(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionSubscriptionXd0282245NoMatchException("InlineCheckoutSessionSubscriptionXd0282245 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionSubscriptionXd0282245(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineCheckoutSessionSubscriptionXd0282245> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionSubscriptionXd0282245 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionSubscriptionXd0282245")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionSubscriptionXd0282245) {
      encoder.requireJsonEncoder("InlineCheckoutSessionSubscriptionXd0282245").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionSubscriptionXd0282245(element: JsonElement): InlineCheckoutSessionSubscriptionXd0282245Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSubscription = element.isJsonDecodable<Subscription>()
  return InlineCheckoutSessionSubscriptionXd0282245Inspection(
    matchesBranch1 = matchesBranch1,
    matchesSubscription = matchesSubscription,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSubscription) add("Subscription: value does not match Subscription")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
