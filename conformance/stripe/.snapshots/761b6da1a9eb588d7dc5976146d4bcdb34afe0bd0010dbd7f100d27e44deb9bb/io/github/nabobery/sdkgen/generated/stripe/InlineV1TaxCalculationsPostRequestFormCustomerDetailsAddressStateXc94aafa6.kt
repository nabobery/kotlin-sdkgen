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

public enum class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Branch {
  Branch1,
  InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c,
}

public sealed class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6NoMatchException(
  message: String,
) : InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6DecodingException(message)

internal data class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Inspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c:
      Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/state.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1tax~1calculations/post/requestBody/content/application~1x-www-form-urlencod
 * ed/schema/properties/customer_details/properties/address/properties/state
 */
@Serializable(with = InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6.Serializer::class)
public class InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c:
      InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c) json.decodeFromJsonElement<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c>(raw) else null }

  public val matchedBranches:
      Set<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Branch.Branch1)
      if (inspection.matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c) add(InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Branch.InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6 {
      val inspection = inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6NoMatchException("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6) {
      encoder.requireJsonEncoder("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6(element: JsonElement): InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c = element.isJsonDecodable<InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c>()
  return InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateXc94aafa6Inspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c = matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c) add("InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c: value does not match InlineV1TaxCalculationsPostRequestFormCustomerDetailsAddressStateAnyOf2Xae0cb16c")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
