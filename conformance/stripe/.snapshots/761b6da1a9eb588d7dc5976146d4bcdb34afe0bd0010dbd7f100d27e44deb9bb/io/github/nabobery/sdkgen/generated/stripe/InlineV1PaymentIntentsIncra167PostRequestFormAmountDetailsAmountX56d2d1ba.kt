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

public enum class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baBranch {
  Branch1,
  InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d,
}

public sealed class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baNoMatchException(
  message: String,
) : InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baDecodingException(message)

internal data class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_intents~1{intent}~1increment_authorization/post/requestBody/content
 * /application~1x-www-form-urlencoded/schema/properties/amount_details/properties/shipping/anyOf/0/properties/amount
 */
@Serializable(with = InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba.Serializer::class)
public class InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baInspection,
) {
  public val branch1: Int? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<Int>(raw) else null }

  public val inlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d:
      InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d) json.decodeFromJsonElement<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baBranch.Branch1)
      if (inspection.matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d) add(InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baBranch.InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba {
      val inspection = inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baNoMatchException("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba) {
      encoder.requireJsonEncoder("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1ba(element: JsonElement): InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baInspection {
  val matchesBranch1 = element.isJsonDecodable<Int>()
  val matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d = element.isJsonDecodable<InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d>()
  return InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAmountX56d2d1baInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d = matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match Int")
      if (!matchesInlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d) add("InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d: value does not match InlineV1PaymentIntentsIncra167PostRequestFormAmountDetailsAnyOf2Xd770059d")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
