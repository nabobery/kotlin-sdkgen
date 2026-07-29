package com.nabobery.sdkgen.generated.stripe

import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/mandate_us_bank_account
 */
@Serializable(with = MandateUsBankAccount.Serializer::class)
public class MandateUsBankAccount(
  /**
   * Mandate collection method
   */
  public val collectionMethod: InlineMandateUsBankAccountCollectionMethodXad379101? = null,
) {
  public class Builder {
    /**
     * Mandate collection method
     */
    public var collectionMethod: InlineMandateUsBankAccountCollectionMethodXad379101? = null

    public fun build(): MandateUsBankAccount = MandateUsBankAccount(
      collectionMethod = collectionMethod,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): MandateUsBankAccount = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<MandateUsBankAccount> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): MandateUsBankAccount {
      val jsonDecoder = decoder.requireJsonDecoder("MandateUsBankAccount")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("MandateUsBankAccount must be a JSON object")
      return MandateUsBankAccount(
        collectionMethod = rawObject["collection_method"]?.let { json.decodeFromJsonElement<InlineMandateUsBankAccountCollectionMethodXad379101>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: MandateUsBankAccount) {
      val jsonEncoder = encoder.requireJsonEncoder("MandateUsBankAccount")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.collectionMethod?.let { put("collection_method", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun mandateUsBankAccount(block: MandateUsBankAccount.Builder.() -> Unit): MandateUsBankAccount = MandateUsBankAccount.build(block)
