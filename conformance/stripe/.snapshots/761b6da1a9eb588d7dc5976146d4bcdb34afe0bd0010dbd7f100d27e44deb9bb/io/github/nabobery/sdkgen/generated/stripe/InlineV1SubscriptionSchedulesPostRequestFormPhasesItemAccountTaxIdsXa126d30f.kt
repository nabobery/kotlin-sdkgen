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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fBranch {
  Branch1,
  InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2,
}

public sealed class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fDecodingException(
  message: String,
) : SerializationException(message)

public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fNoMatchException(
  message: String,
) : InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fDecodingException(message)

internal data class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fInspection(
  public val matchesBranch1: Boolean,
  public val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2).count { it }
}

/**
 * Lossless anyOf wrapper for
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1subscription_schedules/post/requestBody/content/application~1x-www-form-url
 * encoded/schema/properties/phases/items/properties/invoice_settings/properties/account_tax_ids
 */
@Serializable(with = InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f.Serializer::class)
public class InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fInspection,
) {
  public val branch1: List<String>? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<List<String>>(raw) else null }

  public val inlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2:
      InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2) json.decodeFromJsonElement<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2>(raw) else null }

  public val matchedBranches:
      Set<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fBranch.Branch1)
      if (inspection.matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2) add(InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fBranch.InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f {
      val inspection = inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f(raw)
      if (inspection.matchCount == 0) {
        throw InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fNoMatchException("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f) {
      encoder.requireJsonEncoder("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30f(element: JsonElement): InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fInspection {
  val matchesBranch1 = element.isJsonDecodable<List<String>>() && (element as? JsonArray)?.size?.let { it <= 2147483647 } == true
  val matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2 = element.isJsonDecodable<InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2>()
  return InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAccountTaxIdsXa126d30fInspection(
    matchesBranch1 = matchesBranch1,
    matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2 = matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match List")
      if (!matchesInlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2) add("InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2: value does not match InlineV1SubscriptionSchedulesPostRequestFormPhasesItemAnyOf2X3317d0d2")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
