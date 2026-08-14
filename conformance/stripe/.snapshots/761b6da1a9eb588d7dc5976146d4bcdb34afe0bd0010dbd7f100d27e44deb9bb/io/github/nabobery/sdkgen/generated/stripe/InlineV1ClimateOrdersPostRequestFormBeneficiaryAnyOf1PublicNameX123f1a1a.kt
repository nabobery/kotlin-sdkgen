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

public enum class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aBranch {
  Branch1,
  InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae,
}

public sealed class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aNoMatchException(
  message: String,
) : InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aDecodingException(message)

internal data class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0/properties/public_name.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1climate~1orders~1{order}/post/requestBody/content/application~1x-www-form-u
 * rlencoded/schema/properties/beneficiary/anyOf/0/properties/public_name
 */
@Serializable(with = InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a.Serializer::class)
public class InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae:
      InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae) json.decodeFromJsonElement<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae>(raw) else null }

  public val matchedBranches:
      Set<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aBranch.Branch1)
      if (inspection.matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae) add(InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aBranch.InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a {
      val inspection = inspectInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aNoMatchException("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a) {
      encoder.requireJsonEncoder("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1a(element: JsonElement): InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae = element.isJsonDecodable<InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae>()
  return InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameX123f1a1aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae = matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae) add("InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae: value does not match InlineV1ClimateOrdersPostRequestFormBeneficiaryAnyOf1PublicNameAnyOf2Xdfc60eae")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
