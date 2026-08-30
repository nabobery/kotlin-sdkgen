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

public enum class InlineChargeApplicationFeeX9fc79449Branch {
  Branch1,
  ApplicationFee,
}

public sealed class InlineChargeApplicationFeeX9fc79449DecodingException(
  message: String,
) : SerializationException(message)

public class InlineChargeApplicationFeeX9fc79449NoMatchException(
  message: String,
) : InlineChargeApplicationFeeX9fc79449DecodingException(message)

internal data class InlineChargeApplicationFeeX9fc79449Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplicationFee: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplicationFee).count { it }
}

/**
 * The application fee (if any) for the charge. [See the Connect
 * documentation](https://docs.stripe.com/connect/direct-charges#collect-fees) for details.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/charge/properties/application_fee
 */
@Serializable(with = InlineChargeApplicationFeeX9fc79449.Serializer::class)
public class InlineChargeApplicationFeeX9fc79449 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineChargeApplicationFeeX9fc79449Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val applicationFee: ApplicationFee? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplicationFee) json.decodeFromJsonElement<ApplicationFee>(raw) else null }

  public val matchedBranches: Set<InlineChargeApplicationFeeX9fc79449Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineChargeApplicationFeeX9fc79449Branch.Branch1)
      if (inspection.matchesApplicationFee) add(InlineChargeApplicationFeeX9fc79449Branch.ApplicationFee)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineChargeApplicationFeeX9fc79449 {
      val inspection = inspectInlineChargeApplicationFeeX9fc79449(raw)
      if (inspection.matchCount == 0) {
        throw InlineChargeApplicationFeeX9fc79449NoMatchException("InlineChargeApplicationFeeX9fc79449 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineChargeApplicationFeeX9fc79449(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineChargeApplicationFeeX9fc79449> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineChargeApplicationFeeX9fc79449 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineChargeApplicationFeeX9fc79449")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineChargeApplicationFeeX9fc79449) {
      encoder.requireJsonEncoder("InlineChargeApplicationFeeX9fc79449").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineChargeApplicationFeeX9fc79449(element: JsonElement): InlineChargeApplicationFeeX9fc79449Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplicationFee = element.isJsonDecodable<ApplicationFee>()
  return InlineChargeApplicationFeeX9fc79449Inspection(
    matchesBranch1 = matchesBranch1,
    matchesApplicationFee = matchesApplicationFee,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplicationFee) add("ApplicationFee: value does not match ApplicationFee")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
