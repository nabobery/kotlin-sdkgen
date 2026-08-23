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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fBranch {
  Branch1,
  InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b,
}

public sealed class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fNoMatchException(
  message: String,
) : InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fDecodingException(message)

internal data class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b).count { it }
}

/**
 * Set of [key-value pairs](https://docs.stripe.com/api/metadata) that you can attach to an object. This can be useful
 * for storing additional information about the object in a structured format. Individual keys can be unset by posting
 * an empty value to them. All keys can be unset by posting an empty value to `metadata`.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1payment_records~1{id}~1report_payment_attempt_canceled/post/requestBody/con
 * tent/application~1x-www-form-urlencoded/schema/properties/metadata
 */
@Serializable(with = InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f.Serializer::class)
public class InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fInspection,
) {
  public val branch1: JsonObject? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonObject>(raw) else null }

  public val inlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b:
      InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b) json.decodeFromJsonElement<InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b>(raw) else null }

  public val matchedBranches:
      Set<InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fBranch.Branch1)
      if (inspection.matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b) add(InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fBranch.InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f {
      val inspection = inspectInlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fNoMatchException("InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f) {
      encoder.requireJsonEncoder("InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1f(element: JsonElement): InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonObject>()
  val matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b = element.isJsonDecodable<InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b>()
  return InlineV1PaymentRecordsRepocb80PostRequestFormMetadataX98076c1fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b = matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonObject")
      if (!matchesInlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b) add("InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b: value does not match InlineV1PaymentRecordsRepocb80PostRequestFormMetadataAnyOf2Xf0788f7b")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
