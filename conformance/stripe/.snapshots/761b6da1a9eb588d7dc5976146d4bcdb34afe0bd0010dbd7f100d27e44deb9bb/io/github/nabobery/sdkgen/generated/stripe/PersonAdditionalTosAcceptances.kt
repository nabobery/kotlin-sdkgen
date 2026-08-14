package io.github.nabobery.sdkgen.generated.stripe

import kotlin.Unit
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
 * Source: sdkgen://source/openapi.json#/components/schemas/person_additional_tos_acceptances
 */
@Serializable(with = PersonAdditionalTosAcceptances.Serializer::class)
public class PersonAdditionalTosAcceptances(
  /**
   * Details on the legal guardian's acceptance of the main Stripe service agreement.
   */
  public val account: InlinePersonAdditionalTosAcceptancesAccountX74bb852f? = null,
) {
  public class Builder {
    /**
     * Details on the legal guardian's acceptance of the main Stripe service agreement.
     */
    public var account: InlinePersonAdditionalTosAcceptancesAccountX74bb852f? = null

    public fun build(): PersonAdditionalTosAcceptances = PersonAdditionalTosAcceptances(
      account = account,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): PersonAdditionalTosAcceptances = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<PersonAdditionalTosAcceptances> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): PersonAdditionalTosAcceptances {
      val jsonDecoder = decoder.requireJsonDecoder("PersonAdditionalTosAcceptances")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("PersonAdditionalTosAcceptances must be a JSON object")
      return PersonAdditionalTosAcceptances(
        account = rawObject["account"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlinePersonAdditionalTosAcceptancesAccountX74bb852f?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: PersonAdditionalTosAcceptances) {
      val jsonEncoder = encoder.requireJsonEncoder("PersonAdditionalTosAcceptances")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.account?.let { put("account", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun personAdditionalTosAcceptances(block: PersonAdditionalTosAcceptances.Builder.() -> Unit): PersonAdditionalTosAcceptances = PersonAdditionalTosAcceptances.build(block)
