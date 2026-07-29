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

public enum class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bBranch {
  Branch1,
  InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a,
}

public sealed class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bNoMatchException(
  message: String,
) : InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bDecodingException(message)

internal data class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/email.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1setup_intents/post/requestBody/content/application~1x-www-form-urlencoded/s
 * chema/properties/payment_method_data/properties/billing_details/properties/email
 */
@Serializable(with = InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b.Serializer::class)
public class InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a:
      InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a) json.decodeFromJsonElement<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bBranch.Branch1)
      if (inspection.matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a) add(InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bBranch.InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b {
      val inspection = inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bNoMatchException("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b) {
      encoder.requireJsonEncoder("InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0b(element: JsonElement): InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a = element.isJsonDecodable<InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a>()
  return InlineV1SetupIntentsPostRequestFormPaymentMethodDataBillingDetailsEmailX4c050d0bInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a = matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a) add("InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a: value does not match InlineV1SetupIntentsPostRequestFormPaymentMethodDataAnyOf2X25ed642a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
