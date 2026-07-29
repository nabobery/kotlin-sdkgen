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
import kotlinx.serialization.json.JsonArray
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.JsonPrimitive
import kotlinx.serialization.json.decodeFromJsonElement

public enum class DeletedPaymentSourceBranch {
  DeletedBankAccount,
  DeletedCard,
}

public sealed class DeletedPaymentSourceDecodingException(
  message: String,
) : SerializationException(message)

public class DeletedPaymentSourceNoMatchException(
  message: String,
) : DeletedPaymentSourceDecodingException(message)

internal data class DeletedPaymentSourceInspection(
  public val matchesDeletedBankAccount: Boolean,
  public val matchesDeletedCard: Boolean,
  public val failures: List<String>,
) {
  public val matchCount: Int
    get() = listOf(matchesDeletedBankAccount, matchesDeletedCard).count { it }
}

/**
 * Lossless anyOf wrapper for sdkgen://source/openapi.json#/components/schemas/deleted_payment_source.
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/deleted_payment_source
 */
@Serializable(with = DeletedPaymentSource.Serializer::class)
public class DeletedPaymentSource internal constructor(
  /**
   * Raw JSON retained as the serialization authority.
   */
  public val raw: JsonElement,
  private val json: Json,
  private val inspection: DeletedPaymentSourceInspection,
) {
  public val deletedBankAccount: DeletedBankAccountView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedBankAccount) json.decodeFromJsonElement<DeletedBankAccountView>(raw) else null }

  public val deletedCard: DeletedCardView? by
      lazy(LazyThreadSafetyMode.NONE) { if (inspection.matchesDeletedCard) json.decodeFromJsonElement<DeletedCardView>(raw) else null }

  public val matchedBranches: Set<DeletedPaymentSourceBranch>
    get() = buildSet {
      if (inspection.matchesDeletedBankAccount) add(DeletedPaymentSourceBranch.DeletedBankAccount)
      if (inspection.matchesDeletedCard) add(DeletedPaymentSourceBranch.DeletedCard)
    }

  public companion object {
    /**
     * Builds a validated wrapper around raw JSON without rewriting it.
     */
    public fun fromRaw(raw: JsonElement, json: Json = SdkJson): DeletedPaymentSource {
      val inspection = inspectDeletedPaymentSource(raw)
      if (inspection.matchCount == 0) {
        throw DeletedPaymentSourceNoMatchException("DeletedPaymentSource matched 0 branches: " + inspection.failures.joinToString("; "))
      }
      return DeletedPaymentSource(raw, json, inspection)
    }
  }

  public object Serializer : KSerializer<DeletedPaymentSource> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): DeletedPaymentSource {
      val jsonDecoder = decoder.requireJsonDecoder("DeletedPaymentSource")
      return fromRaw(jsonDecoder.decodeJsonElement(), jsonDecoder.json)
    }

    override fun serialize(encoder: Encoder, `value`: DeletedPaymentSource) {
      encoder.requireJsonEncoder("DeletedPaymentSource").encodeJsonElement(value.raw)
    }
  }
}

private fun inspectDeletedPaymentSource(element: JsonElement): DeletedPaymentSourceInspection {
  val raw = element as? JsonObject ?: return DeletedPaymentSourceInspection(
    matchesDeletedBankAccount = false,
    matchesDeletedCard = false,
    failures = listOf("DeletedBankAccount: expected JSON object", "DeletedCard: expected JSON object"),
  )
  val matchesDeletedBankAccount = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
  val matchesDeletedCard = raw["deleted"] != null && raw["id"].isString() && raw["object"] != null
  return DeletedPaymentSourceInspection(
    matchesDeletedBankAccount = matchesDeletedBankAccount,
    matchesDeletedCard = matchesDeletedCard,
    failures = buildList {
      if (!matchesDeletedBankAccount) add("DeletedBankAccount: required properties 'deleted', 'id', 'object' do not match their declared types")
      if (!matchesDeletedCard) add("DeletedCard: required properties 'deleted', 'id', 'object' do not match their declared types")
    },
  )
}

private fun JsonElement?.isString(): Boolean = this is JsonPrimitive && isString

private fun JsonElement?.isStringArray(): Boolean = this is JsonArray && isNotEmpty() && all { it is JsonPrimitive && it.isString }
