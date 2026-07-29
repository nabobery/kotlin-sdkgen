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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Branch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930NoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930DecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_options/properties/konbini
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Inspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Branch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Branch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930 {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930NoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Inspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsKonbiniX4040a930Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X1d8bd05d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
