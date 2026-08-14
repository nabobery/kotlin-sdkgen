package io.github.nabobery.sdkgen.generated.stripe

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

public enum class InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0).count { it }
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
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions~1{subscription_exposed_id}/post/reques
 * tBody/content/application~1x-www-form-urlencoded/schema/properties/default_source
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0:
      InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0) add(InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdBranch.InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbd(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0 = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0>()
  return InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceX0a7eadbdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0 = matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0) add("InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0: value does not match InlineV1CustomersSubscriptionsPostRequestFormDefaultSourceAnyOf2X80e54ff0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
