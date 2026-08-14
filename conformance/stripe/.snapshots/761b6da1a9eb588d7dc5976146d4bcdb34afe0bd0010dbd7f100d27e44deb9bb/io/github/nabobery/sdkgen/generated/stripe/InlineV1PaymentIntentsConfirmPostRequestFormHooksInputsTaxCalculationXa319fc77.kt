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

public enum class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Branch {
  Branch1,
  InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050,
}

public sealed class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77NoMatchException(
  message: String,
) : InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77DecodingException(message)

internal data class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1confirm/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation
 */
@Serializable(with = InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77.Serializer::class)
public class InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050:
      InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050) json.decodeFromJsonElement<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Branch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050) add(InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Branch.InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77 {
      val inspection = inspectInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77NoMatchException("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77(element: JsonElement): InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050 = element.isJsonDecodable<InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050>()
  return InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxCalculationXa319fc77Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050 = matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050) add("InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050: value does not match InlineV1PaymentIntentsConfirmPostRequestFormHooksInputsTaxAnyOf2Xe708b050")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
