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

public enum class InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aBranch {
  Branch1,
  InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125,
}

public sealed class InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aNoMatchException(
  message: String,
) : InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aDecodingException(message)

internal data class InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/get/parameters/1/schema.
 *
 * Source: sdkgen://source/openapi.json#/paths/~1v1~1payment_method_configurations/get/parameters/1/schema
 */
@Serializable(with = InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a.Serializer::class)
public class InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val inlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125:
      InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125) json.decodeFromJsonElement<InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125>(raw) else null }

  public val matchedBranches: Set<InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aBranch.Branch1)
      if (inspection.matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125) add(InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aBranch.InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a {
      val inspection = inspectInlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aNoMatchException("InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a) {
      encoder.requireJsonEncoder("InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentMethodConfigurationsGetParameterXf4c00b1a(element: JsonElement): InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125 = element.isJsonDecodable<InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125>()
  return InlineV1PaymentMethodConfigurationsGetParameterXf4c00b1aInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125 = matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125) add("InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125: value does not match InlineV1PaymentMethodConfigurationsGetParameterAnyOf2Xef4fa125")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
