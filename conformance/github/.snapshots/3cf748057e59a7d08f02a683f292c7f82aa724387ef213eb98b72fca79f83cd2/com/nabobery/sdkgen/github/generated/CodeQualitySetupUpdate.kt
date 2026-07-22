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

public enum class CodeQualitySetupUpdateBranch {
  Branch1,
  Branch2,
  Branch3,
  Branch4,
}

public sealed class CodeQualitySetupUpdateDecodingException(
  message: String,
) : SerializationException(message)

public class CodeQualitySetupUpdateNoMatchException(
  message: String,
) : CodeQualitySetupUpdateDecodingException(message)

internal data class CodeQualitySetupUpdateInspection(
  public val matchesBranch1: Boolean,
  public val matchesBranch2: Boolean,
  public val matchesBranch3: Boolean,
  public val matchesBranch4: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesBranch2, matchesBranch3, matchesBranch4).count { it }
}

/**
 * Configuration for code quality setup.
 *
 * Source: sdkgen://source/openapi.yaml#/components/schemas/code-quality-setup-update
 */
@Serializable(with = CodeQualitySetupUpdate.Serializer::class)
public class CodeQualitySetupUpdate internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: CodeQualitySetupUpdateInspection,
) {
  public val branch1: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch2: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch2) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch3: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch3) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val branch4: JsonElement? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch4) json.decodeFromJsonElement<JsonElement>(raw) else null }

  public val matchedBranches: Set<CodeQualitySetupUpdateBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(CodeQualitySetupUpdateBranch.Branch1)
      if (inspection.matchesBranch2) add(CodeQualitySetupUpdateBranch.Branch2)
      if (inspection.matchesBranch3) add(CodeQualitySetupUpdateBranch.Branch3)
      if (inspection.matchesBranch4) add(CodeQualitySetupUpdateBranch.Branch4)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): CodeQualitySetupUpdate {
      val inspection = inspectCodeQualitySetupUpdate(raw)
      if (inspection.matchCount == 0) {
        throw CodeQualitySetupUpdateNoMatchException("CodeQualitySetupUpdate matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return CodeQualitySetupUpdate(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<CodeQualitySetupUpdate> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): CodeQualitySetupUpdate {
      val jsonDecoder = decoder.requireJsonDecoder("CodeQualitySetupUpdate")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: CodeQualitySetupUpdate) {
      encoder.requireJsonEncoder("CodeQualitySetupUpdate").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectCodeQualitySetupUpdate(element: JsonElement): CodeQualitySetupUpdateInspection {
  val matchesBranch1 = element.isJsonDecodable<JsonElement>()
  val matchesBranch2 = element.isJsonDecodable<JsonElement>()
  val matchesBranch3 = element.isJsonDecodable<JsonElement>()
  val matchesBranch4 = element.isJsonDecodable<JsonElement>()
  return CodeQualitySetupUpdateInspection(
    matchesBranch1 = matchesBranch1,
    matchesBranch2 = matchesBranch2,
    matchesBranch3 = matchesBranch3,
    matchesBranch4 = matchesBranch4,
    failures = buildList {
      if (!matchesBranch1) add("Branch1: value does not match JsonElement")
      if (!matchesBranch2) add("Branch2: value does not match JsonElement")
      if (!matchesBranch3) add("Branch3: value does not match JsonElement")
      if (!matchesBranch4) add("Branch4: value does not match JsonElement")
    },
  )
}

private inline fun <reified T> JsonElement?.isJsonDecodable(): Boolean {
  val element = this ?: return false
  return runCatching { SdkJson.decodeFromJsonElement<T>(element) }.isSuccess
}
