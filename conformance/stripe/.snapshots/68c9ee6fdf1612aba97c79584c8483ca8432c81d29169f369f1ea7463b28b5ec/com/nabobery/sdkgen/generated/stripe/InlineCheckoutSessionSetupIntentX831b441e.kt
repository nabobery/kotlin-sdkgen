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

public enum class InlineCheckoutSessionSetupIntentX831b441eBranch {
  Branch1,
  SetupIntent,
}

public sealed class InlineCheckoutSessionSetupIntentX831b441eDecodingException(
  message: String,
) : SerializationException(message)

public class InlineCheckoutSessionSetupIntentX831b441eNoMatchException(
  message: String,
) : InlineCheckoutSessionSetupIntentX831b441eDecodingException(message)

internal data class InlineCheckoutSessionSetupIntentX831b441eInspection(
  public val matchesBranch1: Boolean,
  public val matchesSetupIntent: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesSetupIntent).count { it }
}

/**
 * The ID of the SetupIntent for Checkout Sessions in `setup` mode. You can't confirm or cancel the SetupIntent for a
 * Checkout Session. To cancel, [expire the Checkout Session](https://docs.stripe.com/api/checkout/sessions/expire)
 * instead.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/checkout.session/properties/setup_intent
 */
@Serializable(with = InlineCheckoutSessionSetupIntentX831b441e.Serializer::class)
public class InlineCheckoutSessionSetupIntentX831b441e internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineCheckoutSessionSetupIntentX831b441eInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val setupIntent: SetupIntent? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesSetupIntent) json.decodeFromJsonElement<SetupIntent>(raw) else null }

  public val matchedBranches: Set<InlineCheckoutSessionSetupIntentX831b441eBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineCheckoutSessionSetupIntentX831b441eBranch.Branch1)
      if (inspection.matchesSetupIntent) add(InlineCheckoutSessionSetupIntentX831b441eBranch.SetupIntent)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineCheckoutSessionSetupIntentX831b441e {
      val inspection = inspectInlineCheckoutSessionSetupIntentX831b441e(raw)
      if (inspection.matchCount == 0) {
        throw InlineCheckoutSessionSetupIntentX831b441eNoMatchException("InlineCheckoutSessionSetupIntentX831b441e matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineCheckoutSessionSetupIntentX831b441e(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineCheckoutSessionSetupIntentX831b441e> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineCheckoutSessionSetupIntentX831b441e {
      val jsonDecoder = decoder.requireJsonDecoder("InlineCheckoutSessionSetupIntentX831b441e")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineCheckoutSessionSetupIntentX831b441e) {
      encoder.requireJsonEncoder("InlineCheckoutSessionSetupIntentX831b441e").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineCheckoutSessionSetupIntentX831b441e(element: JsonElement): InlineCheckoutSessionSetupIntentX831b441eInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesSetupIntent = element.isJsonDecodable<SetupIntent>()
  return InlineCheckoutSessionSetupIntentX831b441eInspection(
    matchesBranch1 = matchesBranch1,
    matchesSetupIntent = matchesSetupIntent,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match String")
      if (!matchesSetupIntent) add("SetupIntent: value does not match SetupIntent")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
