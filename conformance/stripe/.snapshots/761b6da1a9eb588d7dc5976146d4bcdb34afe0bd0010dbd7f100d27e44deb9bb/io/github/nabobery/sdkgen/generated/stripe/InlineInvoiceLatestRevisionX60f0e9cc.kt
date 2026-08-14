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

public enum class InlineInvoiceLatestRevisionX60f0e9ccBranch {
  Branch1,
  Invoice,
}

public sealed class InlineInvoiceLatestRevisionX60f0e9ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceLatestRevisionX60f0e9ccNoMatchException(
  message: String,
) : InlineInvoiceLatestRevisionX60f0e9ccDecodingException(message)

internal data class InlineInvoiceLatestRevisionX60f0e9ccInspection(
  public val matchesBranch1: Boolean,
  public val matchesInvoice: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInvoice).count { it }
}

/**
 * The ID of the most recent non-draft revision of this invoice
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/latest_revision
 */
@Serializable(with = InlineInvoiceLatestRevisionX60f0e9cc.Serializer::class)
public class InlineInvoiceLatestRevisionX60f0e9cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceLatestRevisionX60f0e9ccInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val invoice: Invoice? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInvoice) json.decodeFromJsonElement<Invoice>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceLatestRevisionX60f0e9ccBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceLatestRevisionX60f0e9ccBranch.Branch1)
      if (inspection.matchesInvoice) add(InlineInvoiceLatestRevisionX60f0e9ccBranch.Invoice)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceLatestRevisionX60f0e9cc {
      val inspection = inspectInlineInvoiceLatestRevisionX60f0e9cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceLatestRevisionX60f0e9ccNoMatchException("InlineInvoiceLatestRevisionX60f0e9cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceLatestRevisionX60f0e9cc(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineInvoiceLatestRevisionX60f0e9cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceLatestRevisionX60f0e9cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceLatestRevisionX60f0e9cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceLatestRevisionX60f0e9cc) {
      encoder.requireJsonEncoder("InlineInvoiceLatestRevisionX60f0e9cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceLatestRevisionX60f0e9cc(element: JsonElement): InlineInvoiceLatestRevisionX60f0e9ccInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesInvoice = element.isJsonDecodable<Invoice>()
  return InlineInvoiceLatestRevisionX60f0e9ccInspection(
    matchesBranch1 = matchesBranch1,
    matchesInvoice = matchesInvoice,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesInvoice) add("Invoice: value does not match Invoice")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
