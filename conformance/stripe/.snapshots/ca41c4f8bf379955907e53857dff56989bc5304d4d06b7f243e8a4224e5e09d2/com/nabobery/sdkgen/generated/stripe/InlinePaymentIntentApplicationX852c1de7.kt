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

public enum class InlinePaymentIntentApplicationX852c1de7Branch {
  Branch1,
  Application,
}

public sealed class InlinePaymentIntentApplicationX852c1de7DecodingException(
  message: String,
) : SerializationException(message)

public class InlinePaymentIntentApplicationX852c1de7NoMatchException(
  message: String,
) : InlinePaymentIntentApplicationX852c1de7DecodingException(message)

internal data class InlinePaymentIntentApplicationX852c1de7Inspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * ID of the Connect application that created the PaymentIntent.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/payment_intent/properties/application
 */
@Serializable(with = InlinePaymentIntentApplicationX852c1de7.Serializer::class)
public class InlinePaymentIntentApplicationX852c1de7 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlinePaymentIntentApplicationX852c1de7Inspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val matchedBranches: Set<InlinePaymentIntentApplicationX852c1de7Branch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlinePaymentIntentApplicationX852c1de7Branch.Branch1)
      if (inspection.matchesApplication) add(InlinePaymentIntentApplicationX852c1de7Branch.Application)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlinePaymentIntentApplicationX852c1de7 {
      val inspection = inspectInlinePaymentIntentApplicationX852c1de7(raw)
      if (inspection.matchCount == 0) {
        throw InlinePaymentIntentApplicationX852c1de7NoMatchException("InlinePaymentIntentApplicationX852c1de7 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlinePaymentIntentApplicationX852c1de7(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlinePaymentIntentApplicationX852c1de7> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlinePaymentIntentApplicationX852c1de7 {
      val jsonDecoder = decoder.requireJsonDecoder("InlinePaymentIntentApplicationX852c1de7")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlinePaymentIntentApplicationX852c1de7) {
      encoder.requireJsonEncoder("InlinePaymentIntentApplicationX852c1de7").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlinePaymentIntentApplicationX852c1de7(element: JsonElement): InlinePaymentIntentApplicationX852c1de7Inspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  return InlinePaymentIntentApplicationX852c1de7Inspection(
    matchesBranch1 = matchesBranch1,
    matchesApplication = matchesApplication,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesApplication) add("Application: value does not match Application")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
