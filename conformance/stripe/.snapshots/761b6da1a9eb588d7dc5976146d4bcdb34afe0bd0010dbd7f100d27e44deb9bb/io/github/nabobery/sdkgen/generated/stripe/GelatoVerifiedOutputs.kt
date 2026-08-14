package io.github.nabobery.sdkgen.generated.stripe

import kotlin.String
import kotlin.Unit
import kotlinx.serialization.KSerializer
import kotlinx.serialization.SerialName
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

@Serializable
public data class GelatoVerifiedOutputsView(
  public val address: InlineGelatoVerifiedOutputsAddressXfcb1d786? = null,
  public val dob: InlineGelatoVerifiedOutputsDobXfa069c26? = null,
  public val email: String? = null,
  @SerialName("first_name")
  public val firstName: String? = null,
  @SerialName("id_number")
  public val idNumber: String? = null,
  @SerialName("id_number_type")
  public val idNumberType: InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d? = null,
  @SerialName("last_name")
  public val lastName: String? = null,
  public val phone: String? = null,
  public val sex: InlineGelatoVerifiedOutputsSexX85a28680? = null,
  @SerialName("unparsed_place_of_birth")
  public val unparsedPlaceOfBirth: String? = null,
  @SerialName("unparsed_sex")
  public val unparsedSex: String? = null,
)

/**
 *
 *
 * Source: sdkgen://source/openapi.json#/components/schemas/gelato_verified_outputs
 */
@Serializable(with = GelatoVerifiedOutputs.Serializer::class)
public class GelatoVerifiedOutputs(
  /**
   * The user's verified address.
   */
  public val address: InlineGelatoVerifiedOutputsAddressXfcb1d786? = null,
  /**
   * The user’s verified date of birth.
   */
  public val dob: InlineGelatoVerifiedOutputsDobXfa069c26? = null,
  /**
   * The user's verified email address
   */
  public val email: String? = null,
  /**
   * The user's verified first name.
   */
  public val firstName: String? = null,
  /**
   * The user's verified id number.
   */
  public val idNumber: String? = null,
  /**
   * The user's verified id number type.
   */
  public val idNumberType: InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d? = null,
  /**
   * The user's verified last name.
   */
  public val lastName: String? = null,
  /**
   * The user's verified phone number
   */
  public val phone: String? = null,
  /**
   * The user's verified sex.
   */
  public val sex: InlineGelatoVerifiedOutputsSexX85a28680? = null,
  /**
   * The user's verified place of birth as it appears in the document.
   */
  public val unparsedPlaceOfBirth: String? = null,
  /**
   * The user's verified sex as it appears in the document.
   */
  public val unparsedSex: String? = null,
) {
  public class Builder {
    /**
     * The user's verified address.
     */
    public var address: InlineGelatoVerifiedOutputsAddressXfcb1d786? = null

    /**
     * The user’s verified date of birth.
     */
    public var dob: InlineGelatoVerifiedOutputsDobXfa069c26? = null

    /**
     * The user's verified email address
     */
    public var email: String? = null

    /**
     * The user's verified first name.
     */
    public var firstName: String? = null

    /**
     * The user's verified id number.
     */
    public var idNumber: String? = null

    /**
     * The user's verified id number type.
     */
    public var idNumberType: InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d? = null

    /**
     * The user's verified last name.
     */
    public var lastName: String? = null

    /**
     * The user's verified phone number
     */
    public var phone: String? = null

    /**
     * The user's verified sex.
     */
    public var sex: InlineGelatoVerifiedOutputsSexX85a28680? = null

    /**
     * The user's verified place of birth as it appears in the document.
     */
    public var unparsedPlaceOfBirth: String? = null

    /**
     * The user's verified sex as it appears in the document.
     */
    public var unparsedSex: String? = null

    public fun build(): GelatoVerifiedOutputs = GelatoVerifiedOutputs(
      address = address,
      dob = dob,
      email = email,
      firstName = firstName,
      idNumber = idNumber,
      idNumberType = idNumberType,
      lastName = lastName,
      phone = phone,
      sex = sex,
      unparsedPlaceOfBirth = unparsedPlaceOfBirth,
      unparsedSex = unparsedSex,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): GelatoVerifiedOutputs = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<GelatoVerifiedOutputs> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): GelatoVerifiedOutputs {
      val jsonDecoder = decoder.requireJsonDecoder("GelatoVerifiedOutputs")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("GelatoVerifiedOutputs must be a JSON object")
      return GelatoVerifiedOutputs(
        address = rawObject["address"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoVerifiedOutputsAddressXfcb1d786?>(element) },
        dob = rawObject["dob"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoVerifiedOutputsDobXfa069c26?>(element) },
        email = rawObject["email"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        firstName = rawObject["first_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idNumber = rawObject["id_number"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        idNumberType = rawObject["id_number_type"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoVerifiedOutputsIdNumberTypeX23dd6e9d?>(element) },
        lastName = rawObject["last_name"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        phone = rawObject["phone"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        sex = rawObject["sex"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<InlineGelatoVerifiedOutputsSexX85a28680?>(element) },
        unparsedPlaceOfBirth = rawObject["unparsed_place_of_birth"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
        unparsedSex = rawObject["unparsed_sex"]?.let { element -> if (element == JsonNull) null else json.decodeFromJsonElement<String?>(element) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: GelatoVerifiedOutputs) {
      val jsonEncoder = encoder.requireJsonEncoder("GelatoVerifiedOutputs")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.address?.let { put("address", json.encodeToJsonElement(it)) }
        value.dob?.let { put("dob", json.encodeToJsonElement(it)) }
        value.email?.let { put("email", it) }
        value.firstName?.let { put("first_name", it) }
        value.idNumber?.let { put("id_number", it) }
        value.idNumberType?.let { put("id_number_type", json.encodeToJsonElement(it)) }
        value.lastName?.let { put("last_name", it) }
        value.phone?.let { put("phone", it) }
        value.sex?.let { put("sex", json.encodeToJsonElement(it)) }
        value.unparsedPlaceOfBirth?.let { put("unparsed_place_of_birth", it) }
        value.unparsedSex?.let { put("unparsed_sex", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun gelatoVerifiedOutputs(block: GelatoVerifiedOutputs.Builder.() -> Unit): GelatoVerifiedOutputs = GelatoVerifiedOutputs.build(block)
