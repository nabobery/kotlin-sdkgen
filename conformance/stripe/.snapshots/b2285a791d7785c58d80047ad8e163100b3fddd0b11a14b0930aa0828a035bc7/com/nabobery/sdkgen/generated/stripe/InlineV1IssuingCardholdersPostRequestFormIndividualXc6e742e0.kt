package com.nabobery.sdkgen.generated.stripe

import kotlin.String
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
 * Additional information about an `individual` cardholder.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders~1{cardholder}/post/requestBody/content/application~1x-
 * www-form-urlencoded/schema/properties/individual
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0(
  public val cardIssuing:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399? = null,
  public val dob: InlineV1IssuingCardholdersPostRequestFormIndividualDobX630774e1? = null,
  public val firstName: String? = null,
  public val lastName: String? = null,
  public val verification:
      InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c? = null,
) {
  public class Builder {
    public var cardIssuing: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399?
        = null

    public var dob: InlineV1IssuingCardholdersPostRequestFormIndividualDobX630774e1? = null

    public var firstName: String? = null

    public var lastName: String? = null

    public var verification:
        InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0 = InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0(
      cardIssuing = cardIssuing,
      dob = dob,
      firstName = firstName,
      lastName = lastName,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0 = Builder().apply(block).build()
  }

  public object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0 must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0(
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingXfa209399>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualDobX630774e1>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationXf831392c>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.cardIssuing?.let { put("card_issuing", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.firstName?.let { put("first_name", it) }
        value.lastName?.let { put("last_name", it) }
        value.verification?.let { put("verification", json.encodeToJsonElement(it)) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0(block: InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0 = InlineV1IssuingCardholdersPostRequestFormIndividualXc6e742e0.build(block)
