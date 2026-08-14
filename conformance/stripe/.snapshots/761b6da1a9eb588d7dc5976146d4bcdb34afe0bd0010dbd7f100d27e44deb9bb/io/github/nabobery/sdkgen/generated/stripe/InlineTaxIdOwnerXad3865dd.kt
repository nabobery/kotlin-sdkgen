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

public enum class InlineTaxIdOwnerXad3865ddBranch {
  TaxIDsOwner,
}

public sealed class InlineTaxIdOwnerXad3865ddDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIdOwnerXad3865ddNoMatchException(
  message: String,
) : InlineTaxIdOwnerXad3865ddDecodingException(message)

internal data class InlineTaxIdOwnerXad3865ddInspection(
  public val matchesTaxIDsOwner: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesTaxIDsOwner).count { it }
}

/**
 * The account or customer the tax ID belongs to.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_id/properties/owner
 */
@Serializable(with = InlineTaxIdOwnerXad3865dd.Serializer::class)
public class InlineTaxIdOwnerXad3865dd internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIdOwnerXad3865ddInspection,
) {
  public val taxIDsOwner: TaxIDsOwnerView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesTaxIDsOwner) json.decodeFromJsonElement<TaxIDsOwnerView>(raw) else null }

  public val matchedBranches: Set<InlineTaxIdOwnerXad3865ddBranch>
    get() = buildSet {
      if (inspection.matchesTaxIDsOwner) add(InlineTaxIdOwnerXad3865ddBranch.TaxIDsOwner)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIdOwnerXad3865dd {
      val inspection = inspectInlineTaxIdOwnerXad3865dd(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIdOwnerXad3865ddNoMatchException("InlineTaxIdOwnerXad3865dd matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIdOwnerXad3865dd(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxIdOwnerXad3865dd> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIdOwnerXad3865dd {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIdOwnerXad3865dd")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIdOwnerXad3865dd) {
      encoder.requireJsonEncoder("InlineTaxIdOwnerXad3865dd").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIdOwnerXad3865dd(element: JsonElement): InlineTaxIdOwnerXad3865ddInspection {
  val raw = element as? JsonObject ?: return InlineTaxIdOwnerXad3865ddInspection(
    matchesTaxIDsOwner = false,
    failures = listOf("TaxIDsOwner: expected JSON object"),
  )
  val matchesTaxIDsOwner = raw["type"] != null
  return InlineTaxIdOwnerXad3865ddInspection(
    matchesTaxIDsOwner = matchesTaxIDsOwner,
    failures = buildList {
      if (!matchesTaxIDsOwner) add("TaxIDsOwner: required properties 'type' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
