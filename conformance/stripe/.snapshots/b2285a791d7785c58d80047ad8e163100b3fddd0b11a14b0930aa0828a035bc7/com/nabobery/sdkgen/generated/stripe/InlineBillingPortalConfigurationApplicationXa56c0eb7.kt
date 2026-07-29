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

public enum class InlineBillingPortalConfigurationApplicationXa56c0eb7Branch {
  Branch1,
  Application,
  DeletedApplication,
}

public sealed class InlineBillingPortalConfigurationApplicationXa56c0eb7DecodingException(
  message: String,
) : SerializationException(message)

public class InlineBillingPortalConfigurationApplicationXa56c0eb7NoMatchException(
  message: String,
) : InlineBillingPortalConfigurationApplicationXa56c0eb7DecodingException(message)

internal data class InlineBillingPortalConfigurationApplicationXa56c0eb7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val matchesDeletedApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * ID of the Connect Application that created the configuration.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/billing_portal.configuration/properties/application
 */
@Serializable(with = InlineBillingPortalConfigurationApplicationXa56c0eb7.Serializer::class)
public class InlineBillingPortalConfigurationApplicationXa56c0eb7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineBillingPortalConfigurationApplicationXa56c0eb7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val deletedApplication: DeletedApplication? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedApplication) json.decodeFromJsonElement<DeletedApplication>(raw) else null }

  public val matchedBranches: Set<InlineBillingPortalConfigurationApplicationXa56c0eb7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineBillingPortalConfigurationApplicationXa56c0eb7Branch.Branch1)
      if (inspection.matchesApplication) add(InlineBillingPortalConfigurationApplicationXa56c0eb7Branch.Application)
      if (inspection.matchesDeletedApplication) add(InlineBillingPortalConfigurationApplicationXa56c0eb7Branch.DeletedApplication)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineBillingPortalConfigurationApplicationXa56c0eb7 {
      val inspection = inspectInlineBillingPortalConfigurationApplicationXa56c0eb7(raw)
      if (inspection.matchCount == 0) {
        throw InlineBillingPortalConfigurationApplicationXa56c0eb7NoMatchException("InlineBillingPortalConfigurationApplicationXa56c0eb7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineBillingPortalConfigurationApplicationXa56c0eb7(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<InlineBillingPortalConfigurationApplicationXa56c0eb7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineBillingPortalConfigurationApplicationXa56c0eb7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineBillingPortalConfigurationApplicationXa56c0eb7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineBillingPortalConfigurationApplicationXa56c0eb7) {
      encoder.requireJsonEncoder("InlineBillingPortalConfigurationApplicationXa56c0eb7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineBillingPortalConfigurationApplicationXa56c0eb7(element: JsonElement): InlineBillingPortalConfigurationApplicationXa56c0eb7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
  return InlineBillingPortalConfigurationApplicationXa56c0eb7Inspection(
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
