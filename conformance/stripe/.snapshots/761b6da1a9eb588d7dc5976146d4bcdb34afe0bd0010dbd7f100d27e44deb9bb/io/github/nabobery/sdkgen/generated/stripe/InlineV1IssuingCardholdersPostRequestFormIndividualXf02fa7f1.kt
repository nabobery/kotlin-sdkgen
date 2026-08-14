package io.github.nabobery.sdkgen.generated.stripe

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
 * sdkgen://source/openapi.json#/paths/~1v1~1issuing~1cardholders/post/requestBody/content/application~1x-www-form-urlen
 * coded/schema/properties/individual
 */
@Serializable(with = InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1.Serializer::class)
public class InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1(
  public val cardIssuing:
      InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461? = null,
  public val dob: InlineV1IssuingCardholdersPostRequestFormIndividualDobX98a23742? = null,
  public val firstName: String? = null,
  public val lastName: String? = null,
  public val verification:
      InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92? = null,
) {
  public class Builder {
    public var cardIssuing: InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461?
        = null

    public var dob: InlineV1IssuingCardholdersPostRequestFormIndividualDobX98a23742? = null

    public var firstName: String? = null

    public var lastName: String? = null

    public var verification:
        InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92? = null

    public fun build(): InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1 = InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1(
      cardIssuing = cardIssuing,
      dob = dob,
      firstName = firstName,
      lastName = lastName,
      verification = verification,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1 = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1 {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1 must be a JSON object")
      return InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1(
        cardIssuing = rawObject["card_issuing"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualCardIssuingX607eb461>(it) },
        dob = rawObject["dob"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualDobX98a23742>(it) },
        firstName = rawObject["first_name"]?.let { json.decodeFromJsonElement<String>(it) },
        lastName = rawObject["last_name"]?.let { json.decodeFromJsonElement<String>(it) },
        verification = rawObject["verification"]?.let { json.decodeFromJsonElement<InlineV1IssuingCardholdersPostRequestFormIndividualVerificationX89586f92>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1")
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

public fun inlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1(block: InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1.Builder.() -> Unit): InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1 = InlineV1IssuingCardholdersPostRequestFormIndividualXf02fa7f1.build(block)
