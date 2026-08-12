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

public enum class InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49,
}

public sealed class InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/product_description.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/payment_method_options/properties/konbini/anyOf/0/properties/product_description
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49:
      InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49) add(InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dBranch.InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dNoMatchException("InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5d(element: JsonElement): InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49>()
  return InlineV1PaymentIntentsPostRequestFormProductDescriptionXd44a9c5dInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49 = matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49) add("InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49: value does not match InlineV1PaymentIntentsPostRequestFormPaymentMethodOptionsKonbiniAnyOf2X6969ee49")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
