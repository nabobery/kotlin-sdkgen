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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class InlineAccountBusinessProfileX8962a2f6Branch {
  AccountBusinessProfile,
}

public sealed class InlineAccountBusinessProfileX8962a2f6DecodingException(
  message: String,
) : SerializationException(message)

public class InlineAccountBusinessProfileX8962a2f6NoMatchException(
  message: String,
) : InlineAccountBusinessProfileX8962a2f6DecodingException(message)

internal data class InlineAccountBusinessProfileX8962a2f6Inspection(
  public val matchesAccountBusinessProfile: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesAccountBusinessProfile).count { it }
}

/**
 * Business information about the account.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/account/properties/business_profile
 */
@Serializable(with = InlineAccountBusinessProfileX8962a2f6.Serializer::class)
public class InlineAccountBusinessProfileX8962a2f6 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineAccountBusinessProfileX8962a2f6Inspection,
) {
  public val accountBusinessProfile: AccountBusinessProfileView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesAccountBusinessProfile) json.decodeFromJsonElement<AccountBusinessProfileView>(raw) else null }

  public val matchedBranches: Set<InlineAccountBusinessProfileX8962a2f6Branch>
    get() = buildSet {
      if (inspection.matchesAccountBusinessProfile) add(InlineAccountBusinessProfileX8962a2f6Branch.AccountBusinessProfile)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineAccountBusinessProfileX8962a2f6 {
      val inspection = inspectInlineAccountBusinessProfileX8962a2f6(raw)
      if (inspection.matchCount == 0) {
        throw InlineAccountBusinessProfileX8962a2f6NoMatchException("InlineAccountBusinessProfileX8962a2f6 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineAccountBusinessProfileX8962a2f6(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineAccountBusinessProfileX8962a2f6> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineAccountBusinessProfileX8962a2f6 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineAccountBusinessProfileX8962a2f6")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineAccountBusinessProfileX8962a2f6) {
      encoder.requireJsonEncoder("InlineAccountBusinessProfileX8962a2f6").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineAccountBusinessProfileX8962a2f6(element: JsonElement): InlineAccountBusinessProfileX8962a2f6Inspection {
  val raw = element as? JsonObject ?: return InlineAccountBusinessProfileX8962a2f6Inspection(
    matchesAccountBusinessProfile = false,
    failures = listOf("AccountBusinessProfile: expected JSON object"),
  )
  val matchesAccountBusinessProfile = true
  return InlineAccountBusinessProfileX8962a2f6Inspection(
    matchesAccountBusinessProfile = matchesAccountBusinessProfile,
    failures = buildList {
      if (!matchesAccountBusinessProfile) add("AccountBusinessProfile: required properties  do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
