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

public enum class InlineIssuingCardWalletsX02783822Branch {
  IssuingCardWallets,
}

public sealed class InlineIssuingCardWalletsX02783822DecodingException(
  message: String,
) : SerializationException(message)

public class InlineIssuingCardWalletsX02783822NoMatchException(
  message: String,
) : InlineIssuingCardWalletsX02783822DecodingException(message)

internal data class InlineIssuingCardWalletsX02783822Inspection(
  public val matchesIssuingCardWallets: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesIssuingCardWallets).count { it }
}

/**
 * Information relating to digital wallets (like Apple Pay and Google Pay).
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/issuing.card/properties/wallets
 */
@Serializable(with = InlineIssuingCardWalletsX02783822.Serializer::class)
public class InlineIssuingCardWalletsX02783822 internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineIssuingCardWalletsX02783822Inspection,
) {
  public val issuingCardWallets: IssuingCardWalletsView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesIssuingCardWallets) json.decodeFromJsonElement<IssuingCardWalletsView>(raw) else null }

  public val matchedBranches: Set<InlineIssuingCardWalletsX02783822Branch>
    get() = buildSet {
      if (inspection.matchesIssuingCardWallets) add(InlineIssuingCardWalletsX02783822Branch.IssuingCardWallets)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineIssuingCardWalletsX02783822 {
      val inspection = inspectInlineIssuingCardWalletsX02783822(raw)
      if (inspection.matchCount == 0) {
        throw InlineIssuingCardWalletsX02783822NoMatchException("InlineIssuingCardWalletsX02783822 matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineIssuingCardWalletsX02783822(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineIssuingCardWalletsX02783822> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineIssuingCardWalletsX02783822 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineIssuingCardWalletsX02783822")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineIssuingCardWalletsX02783822) {
      encoder.requireJsonEncoder("InlineIssuingCardWalletsX02783822").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineIssuingCardWalletsX02783822(element: JsonElement): InlineIssuingCardWalletsX02783822Inspection {
  val raw = element as? JsonObject ?: return InlineIssuingCardWalletsX02783822Inspection(
    matchesIssuingCardWallets = false,
    failures = listOf("IssuingCardWallets: expected JSON object"),
  )
  val matchesIssuingCardWallets = raw["apple_pay"] != null && raw["google_pay"] != null
  return InlineIssuingCardWalletsX02783822Inspection(
    matchesIssuingCardWallets = matchesIssuingCardWallets,
    failures = buildList {
      if (!matchesIssuingCardWallets) add("IssuingCardWallets: required properties 'apple_pay', 'google_pay' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
