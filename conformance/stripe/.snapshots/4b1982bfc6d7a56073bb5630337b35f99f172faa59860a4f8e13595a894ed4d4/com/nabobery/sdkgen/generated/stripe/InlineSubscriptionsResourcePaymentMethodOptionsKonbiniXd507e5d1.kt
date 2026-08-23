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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

@Serializable
public class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch1View()

public enum class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch {
  Branch1,
}

public sealed class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1NoMatchException(
  message: String,
) : InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1DecodingException(message)

internal data class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Inspection(
  public val matchesBranch1: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1).count { it }
}

/**
 * This sub-hash contains details about the Konbini payment method options to pass to invoices created by the
 * subscription.
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/subscriptions_resource_payment_method_options/properties/konbini
 */
@Serializable(with = InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1.Serializer::class)
public class InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Inspection,
) {
  public val branch1: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch1View? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch1View>(raw) else null }

  public val matchedBranches:
      Set<InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Branch.Branch1)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1 {
      val inspection = inspectInlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1(raw)
      if (inspection.matchCount == 0) {
        throw InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1NoMatchException("InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1) {
      encoder.requireJsonEncoder("InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1(element: JsonElement): InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Inspection {
  val raw = element as? JsonObject ?: return InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Inspection(
    matchesBranch1 = false,
    failures = listOf("Branch1: expected JSON object"),
  )
  val matchesBranch1 = true
  return InlineSubscriptionsResourcePaymentMethodOptionsKonbiniXd507e5d1Inspection(
    matchesBranch1 = matchesBranch1,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
