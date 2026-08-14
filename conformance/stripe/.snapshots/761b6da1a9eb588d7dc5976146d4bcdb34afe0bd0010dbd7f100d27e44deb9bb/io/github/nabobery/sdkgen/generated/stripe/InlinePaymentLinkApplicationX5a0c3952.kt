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

public enum class InlinePaymentLinkApplicationX5a0c3952Branch {
  Branch1,
  Application,
  DeletedApplication,
}

public sealed class InlinePaymentLinkApplicationX5a0c3952DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentLinkApplicationX5a0c3952NoMatchException(
  message: String,
) : InlinePaymentLinkApplicationX5a0c3952DecodingException(message)

internal data class InlinePaymentLinkApplicationX5a0c3952Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val matchesDeletedApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication, matchesDeletedApplication).count { it }
}

/**
 * The ID of the Connect application that created the Payment Link.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_link/properties/application
 */
@Serializable(with = InlinePaymentLinkApplicationX5a0c3952.Serializer::class)
public class InlinePaymentLinkApplicationX5a0c3952 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentLinkApplicationX5a0c3952Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val deletedApplication: DeletedApplication? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedApplication) json.decodeFromJsonElement<DeletedApplication>(raw) else null }

  public val matchedBranches: Set<InlinePaymentLinkApplicationX5a0c3952Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentLinkApplicationX5a0c3952Branch.Branch1)
      if (inspection.matchesApplication) add(InlinePaymentLinkApplicationX5a0c3952Branch.Application)
      if (inspection.matchesDeletedApplication) add(InlinePaymentLinkApplicationX5a0c3952Branch.DeletedApplication)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentLinkApplicationX5a0c3952 {
      val inspection = inspectInlinePaymentLinkApplicationX5a0c3952(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentLinkApplicationX5a0c3952NoMatchException("InlinePaymentLinkApplicationX5a0c3952 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentLinkApplicationX5a0c3952(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentLinkApplicationX5a0c3952> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentLinkApplicationX5a0c3952 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentLinkApplicationX5a0c3952")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentLinkApplicationX5a0c3952) {
      encoder.requireJsonEncoder("InlinePaymentLinkApplicationX5a0c3952").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentLinkApplicationX5a0c3952(element: JsonElement): InlinePaymentLinkApplicationX5a0c3952Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  val matchesDeletedApplication = element.isJsonDecodable<DeletedApplication>()
  return InlinePaymentLinkApplicationX5a0c3952Inspection(
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
