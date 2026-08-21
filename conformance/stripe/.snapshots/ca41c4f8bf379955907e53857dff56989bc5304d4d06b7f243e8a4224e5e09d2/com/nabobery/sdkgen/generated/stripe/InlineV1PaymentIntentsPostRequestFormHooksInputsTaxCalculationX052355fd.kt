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

public enum class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdBranch {
  Branch1,
  InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0,
}

public sealed class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdNoMatchException(
  message: String,
) : InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdDecodingException(message)

internal data class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}/post/requestBody/content/application~1x-www-form-
 * urlencoded/schema/properties/hooks/properties/inputs/properties/tax/properties/calculation
 */
@Serializable(with = InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd.Serializer::class)
public class InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0:
      InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0) json.decodeFromJsonElement<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0) add(InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdBranch.InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd {
      val inspection = inspectInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdNoMatchException("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fd(element: JsonElement): InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0 = element.isJsonDecodable<InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0>()
  return InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationX052355fdInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0 = matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0) add("InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0: value does not match InlineV1PaymentIntentsPostRequestFormHooksInputsTaxCalculationAnyOf2X9336f8f0")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
