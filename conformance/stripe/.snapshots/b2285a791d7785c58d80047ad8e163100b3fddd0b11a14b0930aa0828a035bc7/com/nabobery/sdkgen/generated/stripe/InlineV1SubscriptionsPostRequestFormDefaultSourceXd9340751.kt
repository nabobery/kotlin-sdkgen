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

public enum class InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Branch {
  Branch1,
  InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef,
}

public sealed class InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751NoMatchException(
  message: String,
) : InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751DecodingException(message)

internal data class InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef).count { it }
}

/**
 * ID of the default payment source for the subscription. It must belong to the customer associated with the
 * subscription and be in a chargeable state. If `default_payment_method` is also set, `default_payment_method` will
 * take precedence. If neither are set, invoices will use the customer's
 * [invoice_settings.default_payment_method](https://docs.stripe.com/api/customers/object#customer_object-invoice_settin
 * gs-default_payment_method) or
 * [default_source](https://docs.stripe.com/api/customers/object#customer_object-default_source).
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscriptions~1{subscription_exposed_id}/post/requestBody/content/applicati
 * on~1x-www-form-urlencoded/schema/properties/default_source
 */
@Serializable(with = InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751.Serializer::class)
public class InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef:
      InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef) json.decodeFromJsonElement<InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef>(raw) else null }

  public val matchedBranches: Set<InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Branch.Branch1)
      if (inspection.matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef) add(InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Branch.InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751 {
      val inspection = inspectInlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751NoMatchException("InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751) {
      encoder.requireJsonEncoder("InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751(element: JsonElement): InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef = element.isJsonDecodable<InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef>()
  return InlineV1SubscriptionsPostRequestFormDefaultSourceXd9340751Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef = matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef) add("InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef: value does not match InlineV1SubscriptionsPostRequestFormDefaultSourceAnyOf2Xa23447ef")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
