package com.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonNull
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source:
 * sdkgen://source/openapi.json#/components/schemas/tax_product_resource_tax_settings_status_details_resource_pending
 */
@Serializable(with = TaxProductResourceTaxSettingsStatusDetailsResourcePending.Serializer::class)
public class TaxProductResourceTaxSettingsStatusDetailsResourcePending(
  missingFields: List<String>? = null,
) {
  /**
   * The list of missing fields that are required to perform calculations. It includes the entry `head_office` when the
   * status is `pending`. It is recommended to set the optional values even if they aren't listed as required for
   * calculating taxes. Calculations can fail if missing fields aren't explicitly provided on every call.
   */
  public val missingFields: List<String>? =
      missingFields?.let { collection0 -> collection0.toList() }

  public class Builder {
    private var missingFieldsValue: List<String>? = null

    /**
     * The list of missing fields that are required to perform calculations. It includes the entry `head_office` when
     * the status is `pending`. It is recommended to set the optional values even if they aren't listed as required for
     * calculating taxes. Calculations can fail if missing fields aren't explicitly provided on every call.
     */
    public var missingFields: List<String>?
      get() = missingFieldsValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        missingFieldsValue = value?.let { collection0 -> collection0.toList() }
      }

    public fun build(): TaxProductResourceTaxSettingsStatusDetailsResourcePending = TaxProductResourceTaxSettingsStatusDetailsResourcePending(
      missingFields = missingFields,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): TaxProductResourceTaxSettingsStatusDetailsResourcePending = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<TaxProductResourceTaxSettingsStatusDetailsResourcePending> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): TaxProductResourceTaxSettingsStatusDetailsResourcePending {
      val jsonDecoder = decoder.requireJsonDecoder("TaxProductResourceTaxSettingsStatusDetailsResourcePending")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("TaxProductResourceTaxSettingsStatusDetailsResourcePending must be a JSON object")
      return TaxProductResourceTaxSettingsStatusDetailsResourcePending(
        missingFields = rawObject["missing_fields"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<List<String>?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: TaxProductResourceTaxSettingsStatusDetailsResourcePending) {
      val jsonEncoder = encoder.requireJsonEncoder("TaxProductResourceTaxSettingsStatusDetailsResourcePending")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.missingFields?.let { put("missing_fields", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun taxProductResourceTaxSettingsStatusDetailsResourcePending(block: TaxProductResourceTaxSettingsStatusDetailsResourcePending.Builder.() -> Unit): TaxProductResourceTaxSettingsStatusDetailsResourcePending = TaxProductResourceTaxSettingsStatusDetailsResourcePending.build(block)
