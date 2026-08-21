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
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdBranch {
  Branch1,
  InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e,
}

public sealed class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdNoMatchException(
  message: String,
) : InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdDecodingException(message)

internal data class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1customers~1{customer}~1subscriptions/post/requestBody/content/application~1
 * x-www-form-urlencoded/schema/properties/payment_settings/properties/payment_method_types
 */
@Serializable(with = InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd.Serializer::class)
public class InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdInspection,
) {
  public val branch1:
      List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX2477715e>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX2477715e>>(raw) else null }

  public val inlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e:
      InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e) json.decodeFromJsonElement<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdBranch.Branch1)
      if (inspection.matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e) add(InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdBranch.InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd {
      val inspection = inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdNoMatchException("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd) {
      encoder.requireJsonEncoder("InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cd(element: JsonElement): InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdInspection {
  val matchesBranch1 = element.isJsonDecodable<List<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsItemX2477715e>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e = element.isJsonDecodable<InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e>()
  return InlineV1CustomersSubscriptionsPostRequestFormPaymentMethodTypesX39a3e3cdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e = matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e) add("InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e: value does not match InlineV1CustomersSubscriptionsPostRequestFormPaymentSettingsAnyOf2X9be6621e")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
