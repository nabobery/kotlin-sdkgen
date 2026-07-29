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

public enum class InlineInvoiceApplicationXa23803ccBranch {
  Branch1,
  Application,
  DeletedApplication,
}

public sealed class InlineInvoiceApplicationXa23803ccDecodingException(
  message: String,
) : SerializationException(message)

public class InlineInvoiceApplicationXa23803ccNoMatchException(
  message: String,
) : InlineInvoiceApplicationXa23803ccDecodingException(message)

internal data class InlineInvoiceApplicationXa23803ccInspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val matchesDeletedApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * ID of the Connect Application that created the invoice.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/invoice/properties/application
 */
@Serializable(with = InlineInvoiceApplicationXa23803cc.Serializer::class)
public class InlineInvoiceApplicationXa23803cc internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineInvoiceApplicationXa23803ccInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val deletedApplication: DeletedApplication? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedApplication) json.decodeFromJsonElement<DeletedApplication>(raw) else null }

  public val matchedBranches: Set<InlineInvoiceApplicationXa23803ccBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineInvoiceApplicationXa23803ccBranch.Branch1)
      if (inspection.matchesApplication) add(InlineInvoiceApplicationXa23803ccBranch.Application)
      if (inspection.matchesDeletedApplication) add(InlineInvoiceApplicationXa23803ccBranch.DeletedApplication)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineInvoiceApplicationXa23803cc {
      val inspection = inspectInlineInvoiceApplicationXa23803cc(raw)
      if (inspection.matchCount == 0) {
        throw InlineInvoiceApplicationXa23803ccNoMatchException("InlineInvoiceApplicationXa23803cc matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineInvoiceApplicationXa23803cc(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineInvoiceApplicationXa23803cc> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineInvoiceApplicationXa23803cc {
      val jsonDecoder = decoder.requireJsonDecoder("InlineInvoiceApplicationXa23803cc")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineInvoiceApplicationXa23803cc) {
      encoder.requireJsonEncoder("InlineInvoiceApplicationXa23803cc").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineInvoiceApplicationXa23803cc(element: JsonElement): InlineInvoiceApplicationXa23803ccInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
  return InlineInvoiceApplicationXa23803ccInspection(
    matchesBranch1 = matchesBranch1,
    matchesApplication = matchesApplication,
    matchesDeletedApplication = matchesDeletedApplication,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplication) add("Application: value does not match Application")
      if (!matchesDeletedApplication) add("DeletedApplication: value does not match DeletedApplication")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
