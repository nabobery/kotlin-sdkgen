package com.nabobery.sdkgen.github.generated

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

public enum class SecretScanningCustomPatternToUpdateBranch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
  Branch5,
}

public sealed class SecretScanningCustomPatternToUpdateDecodingException(
  message: String,
) : SerializationException(message)

public class SecretScanningCustomPatternToUpdateNoMatchException(
  message: String,
) : SecretScanningCustomPatternToUpdateDecodingException(message)

internal data class SecretScanningCustomPatternToUpdateInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val matchesBranch5: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4, matchesBranch5).count { it }
}

/**
 * Fields to update on a custom pattern. At least one updatable field (`pattern`, `start_delimiter`, `end_delimiter`,
 * `must_match`, or `must_not_match`) must also be provided. Only provided fields will be updated.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/secret-scanning-custom-pattern-to-update
 */
@Serializable(with = SecretScanningCustomPatternToUpdate.Serializer::class)
public class SecretScanningCustomPatternToUpdate internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: SecretScanningCustomPatternToUpdateInspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch5: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch5) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<SecretScanningCustomPatternToUpdateBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(SecretScanningCustomPatternToUpdateBranch.Branch1)
      if (inspection.matchesBranch2) add(SecretScanningCustomPatternToUpdateBranch.Branch2)
      if (inspection.matchesBranch3) add(SecretScanningCustomPatternToUpdateBranch.Branch3)
      if (inspection.matchesBranch4) add(SecretScanningCustomPatternToUpdateBranch.Branch4)
      if (inspection.matchesBranch5) add(SecretScanningCustomPatternToUpdateBranch.Branch5)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): SecretScanningCustomPatternToUpdate {
      val inspection = inspectSecretScanningCustomPatternToUpdate(raw)
      if (inspection.matchCount == 0) {
        throw SecretScanningCustomPatternToUpdateNoMatchException("SecretScanningCustomPatternToUpdate matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return SecretScanningCustomPatternToUpdate(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<SecretScanningCustomPatternToUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): SecretScanningCustomPatternToUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("SecretScanningCustomPatternToUpdate")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: SecretScanningCustomPatternToUpdate) {
      encoder.requireJsonEncoder("SecretScanningCustomPatternToUpdate").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectSecretScanningCustomPatternToUpdate(element: JsonElement): SecretScanningCustomPatternToUpdateInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement>()
  val matchesBranch5 = element.isJsonDecodable<JsonElement>()
  return SecretScanningCustomPatternToUpdateInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    matchesBranch5 = matchesBranch5,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
      if (!matchesBranch5) add("Branch5: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
