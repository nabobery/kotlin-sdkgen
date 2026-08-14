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

public enum class InlineTaxIDsOwnerApplicationXe5bdf86cBranch {
  Branch1,
  Application,
}

public sealed class InlineTaxIDsOwnerApplicationXe5bdf86cDecodingException(
  message: String,
) : SerializationException(message)

public class InlineTaxIDsOwnerApplicationXe5bdf86cNoMatchException(
  message: String,
) : InlineTaxIDsOwnerApplicationXe5bdf86cDecodingException(message)

internal data class InlineTaxIDsOwnerApplicationXe5bdf86cInspection(
  public val matchesBranch1: Boolean,
  public val matchesApplication: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesBranch1, matchesApplication).count { it }
}

/**
 * The Connect Application being referenced when `type` is `application`.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/tax_i_ds_owner/properties/application
 */
@Serializable(with = InlineTaxIDsOwnerApplicationXe5bdf86c.Serializer::class)
public class InlineTaxIDsOwnerApplicationXe5bdf86c internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: InlineTaxIDsOwnerApplicationXe5bdf86cInspection,
) {
  public val branch1: String? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesBranch1) json.decodeFromJsonElement<String>(raw) else null }

  public val application: Application? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesApplication) json.decodeFromJsonElement<Application>(raw) else null }

  public val matchedBranches: Set<InlineTaxIDsOwnerApplicationXe5bdf86cBranch>
    get() = buildSet {
      if (inspection.matchesBranch1) add(InlineTaxIDsOwnerApplicationXe5bdf86cBranch.Branch1)
      if (inspection.matchesApplication) add(InlineTaxIDsOwnerApplicationXe5bdf86cBranch.Application)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): InlineTaxIDsOwnerApplicationXe5bdf86c {
      val inspection = inspectInlineTaxIDsOwnerApplicationXe5bdf86c(raw)
      if (inspection.matchCount == 0) {
        throw InlineTaxIDsOwnerApplicationXe5bdf86cNoMatchException("InlineTaxIDsOwnerApplicationXe5bdf86c matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return InlineTaxIDsOwnerApplicationXe5bdf86c(raw, json, inspection)
    }
  }

  internal object Serializer : KSerializer<InlineTaxIDsOwnerApplicationXe5bdf86c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineTaxIDsOwnerApplicationXe5bdf86c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineTaxIDsOwnerApplicationXe5bdf86c")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: InlineTaxIDsOwnerApplicationXe5bdf86c) {
      encoder.requireJsonEncoder("InlineTaxIDsOwnerApplicationXe5bdf86c").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectInlineTaxIDsOwnerApplicationXe5bdf86c(element: JsonElement): InlineTaxIDsOwnerApplicationXe5bdf86cInspection {
  val matchesBranch1 = element.isJsonDecodable<String>()
  val matchesApplication = element.isJsonDecodable<Application>()
  return InlineTaxIDsOwnerApplicationXe5bdf86cInspection(
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
