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

public enum class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Branch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152,
}

public sealed class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1NoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1DecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs/properties/tax/properties/calculation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents/post/requestBody/content/application~1x-www-form-urlencoded
 * /schema/properties/hooks/properties/inputs/properties/tax/properties/calculation
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152:
      InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152) add(InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Branch.InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1 {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1NoMatchException("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1(element: JsonElement): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152>()
  return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX645188b1Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152 = matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152) add("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152: value does not match InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2Xcb4fb152")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
