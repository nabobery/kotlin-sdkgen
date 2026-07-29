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

public enum class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feBranch {
  Branch1,
  InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a,
}

public sealed class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feNoMatchException(
  message: String,
) : InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feDecodingException(message)

internal data class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/start_date.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1checkout~1sessions/post/requestBody/content/application~1x-www-form-urlenco
 * ded/schema/properties/payment_method_options/properties/payto/properties/mandate_options/properties/start_date
 */
@Serializable(with = InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe.Serializer::class)
public class InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a:
      InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a) json.decodeFromJsonElement<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a>(raw) else null }

  public val matchedBranches:
      Set<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feBranch.Branch1)
      if (inspection.matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a) add(InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feBranch.InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe {
      val inspection = inspectInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feNoMatchException("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe) {
      encoder.requireJsonEncoder("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726fe(element: JsonElement): InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a = element.isJsonDecodable<InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a>()
  return InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsStartDateX2d9726feInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a = matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a) add("InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a: value does not match InlineV1CheckoutSessionsPostRequestFormPaymentMethodOptionsPaytoAnyOf2X9ed7e17a")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
