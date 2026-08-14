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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eBranch {
  Branch1,
  InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eNoMatchException(
  message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_post
 * al_code.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/from_post
 * al_code
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614) add(InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e {
      val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eNoMatchException("InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65e(element: JsonElement): InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614 = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614>()
  return InlineV1PaymentIntentsIncra167PostRequestFormFromPostalCodeX4147c65eInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614 = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614) add("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2X8b5ce614")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
