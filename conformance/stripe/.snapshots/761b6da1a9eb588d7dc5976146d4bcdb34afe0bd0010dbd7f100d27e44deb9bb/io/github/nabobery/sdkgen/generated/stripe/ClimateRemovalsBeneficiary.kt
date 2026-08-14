package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.Serializable
import kotlinx.serialization.SerializationException
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonElement
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.put

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/climate_removals_beneficiary
 */
@Serializable(with = ClimateRemovalsBeneficiary.Serializer::class)
public class ClimateRemovalsBeneficiary(
  /**
   * Publicly displayable name for the end beneficiary of carbon removal.
   */
  public val publicName: String,
) {
  public class Builder {
    private var publicNameValue: String? = null

    public var publicName: String
      get() = requireNotNull(publicNameValue) { "publicName is required" }
      set(`value`) {
        publicNameValue = value
      }

    public fun build(): ClimateRemovalsBeneficiary {
      check(publicNameValue != null) { "publicName is required" }
      return ClimateRemovalsBeneficiary(
        publicName = publicName,
      )
    }
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): ClimateRemovalsBeneficiary = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<ClimateRemovalsBeneficiary> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): ClimateRemovalsBeneficiary {
      val jsonDecoder = decoder.requireJsonDecoder("ClimateRemovalsBeneficiary")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("ClimateRemovalsBeneficiary must be a JSON object")
      val publicName = json.decodeRequired<String>(rawObject, "public_name")
      return ClimateRemovalsBeneficiary(
        publicName = publicName,
      )
    }

    override fun serialize(encoder: Encoder, `value`: ClimateRemovalsBeneficiary) {
      val jsonEncoder = encoder.requireJsonEncoder("ClimateRemovalsBeneficiary")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        put("public_name", value.publicName)
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun climateRemovalsBeneficiary(block: ClimateRemovalsBeneficiary.Builder.() -> Unit): ClimateRemovalsBeneficiary = ClimateRemovalsBeneficiary.build(block)

private inline fun <reified T> Json.decodeRequired(raw: JsonObject, name: String): T {
  val element = raw[name] ?: throw SerializationException("ClimateRemovalsBeneficiary is missing required property '" + name + "'")
  return decodeFromJsonElement(element)
}
