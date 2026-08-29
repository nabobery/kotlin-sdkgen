package com.nabobery.sdkgen.generated.stripe

import kotlin.Int
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
import kotlinx.serialization.json.JsonObject
import kotlinx.serialization.json.buildJsonObject
import kotlinx.serialization.json.decodeFromJsonElement
import kotlinx.serialization.json.encodeToJsonElement
import kotlinx.serialization.json.put

/**
 * Generated model for
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1capture/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema.
 *
 * Source:
 * sdkgen://source/openapi.json#/paths/~1v1~1charges~1{charge}~1capture/post/requestBody/content/application~1x-www-form
 * -urlencoded/schema
 */
@Serializable(with = InlineV1ChargesCapturePostRequestFormXf632138c.Serializer::class)
public class InlineV1ChargesCapturePostRequestFormXf632138c(
  /**
   * The amount to capture, which must be less than or equal to the original amount.
   */
  public val amount: Int? = null,
  /**
   * An application fee to add on to this charge.
   */
  public val applicationFee: Int? = null,
  /**
   * An application fee amount to add on to this charge, which must be less than or equal to the original amount.
   */
  public val applicationFeeAmount: Int? = null,
  expand: List<String>? = null,
  /**
   * The email address to send this charge's receipt to. This will override the previously-specified email address for
   * this charge, if one was set. Receipts will not be sent in test mode.
   */
  public val receiptEmail: String? = null,
  /**
   * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
   * overrides the account's default statement descriptor. For information about requirements, including the
   * 22-character limit, see [the Statement Descriptor
   * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
   *
   * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
   * this value is used as the suffix.
   */
  public val statementDescriptor: String? = null,
  /**
   * Provides information about a card charge. Concatenated to the account's [statement descriptor
   * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
   * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is concatenated
   * to the account's statement descriptor.
   */
  public val statementDescriptorSuffix: String? = null,
  /**
   * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See the
   * Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
   */
  public val transferData: InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867? = null,
  /**
   * A string that identifies this transaction as part of a group. `transfer_group` may only be provided if it has not
   * been set. See the [Connect
   * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
   */
  public val transferGroup: String? = null,
) {
  /**
   * Specifies which fields in the response should be expanded.
   */
  public val expand: List<String>? = expand?.let { collection0 -> collection0.toList() }

  public class Builder {
    /**
     * The amount to capture, which must be less than or equal to the original amount.
     */
    public var amount: Int? = null

    /**
     * An application fee to add on to this charge.
     */
    public var applicationFee: Int? = null

    /**
     * An application fee amount to add on to this charge, which must be less than or equal to the original amount.
     */
    public var applicationFeeAmount: Int? = null

    private var expandValue: List<String>? = null

    /**
     * Specifies which fields in the response should be expanded.
     */
    public var expand: List<String>?
      get() = expandValue?.let { collection0 -> collection0.toList() }
      set(`value`) {
        expandValue = value?.let { collection0 -> collection0.toList() }
      }

    /**
     * The email address to send this charge's receipt to. This will override the previously-specified email address for
     * this charge, if one was set. Receipts will not be sent in test mode.
     */
    public var receiptEmail: String? = null

    /**
     * For a non-card charge, text that appears on the customer's statement as the statement descriptor. This value
     * overrides the account's default statement descriptor. For information about requirements, including the
     * 22-character limit, see [the Statement Descriptor
     * docs](https://docs.stripe.com/get-started/account/statement-descriptors).
     *
     * For a card charge, this value is ignored unless you don't specify a `statement_descriptor_suffix`, in which case
     * this value is used as the suffix.
     */
    public var statementDescriptor: String? = null

    /**
     * Provides information about a card charge. Concatenated to the account's [statement descriptor
     * prefix](https://docs.stripe.com/get-started/account/statement-descriptors#static) to form the complete statement
     * descriptor that appears on the customer's statement. If the account has no prefix value, the suffix is
     * concatenated to the account's statement descriptor.
     */
    public var statementDescriptorSuffix: String? = null

    /**
     * An optional dictionary including the account to automatically transfer to as part of a destination charge. [See
     * the Connect documentation](https://docs.stripe.com/connect/destination-charges) for details.
     */
    public var transferData: InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867? = null

    /**
     * A string that identifies this transaction as part of a group. `transfer_group` may only be provided if it has not
     * been set. See the [Connect
     * documentation](https://docs.stripe.com/connect/separate-charges-and-transfers#transfer-options) for details.
     */
    public var transferGroup: String? = null

    public fun build(): InlineV1ChargesCapturePostRequestFormXf632138c = InlineV1ChargesCapturePostRequestFormXf632138c(
      amount = amount,
      applicationFee = applicationFee,
      applicationFeeAmount = applicationFeeAmount,
      expand = expand,
      receiptEmail = receiptEmail,
      statementDescriptor = statementDescriptor,
      statementDescriptorSuffix = statementDescriptorSuffix,
      transferData = transferData,
      transferGroup = transferGroup,
    )
  }

  public companion object {
    public fun build(block: Builder.() -> Unit): InlineV1ChargesCapturePostRequestFormXf632138c = Builder().apply(block).build()
  }

  internal object Serializer : KSerializer<InlineV1ChargesCapturePostRequestFormXf632138c> {
    override val descriptor: SerialDescriptor = JsonElement.serializer().descriptor

    override fun deserialize(decoder: Decoder): InlineV1ChargesCapturePostRequestFormXf632138c {
      val jsonDecoder = decoder.requireJsonDecoder("InlineV1ChargesCapturePostRequestFormXf632138c")
      val json = jsonDecoder.json
      val rawObject = jsonDecoder.decodeJsonElement() as? JsonObject ?: throw SerializationException("InlineV1ChargesCapturePostRequestFormXf632138c must be a JSON object")
      return InlineV1ChargesCapturePostRequestFormXf632138c(
        amount = rawObject["amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        applicationFee = rawObject["application_fee"]?.let { json.decodeFromJsonElement<Int>(it) },
        applicationFeeAmount = rawObject["application_fee_amount"]?.let { json.decodeFromJsonElement<Int>(it) },
        expand = rawObject["expand"]?.let { json.decodeFromJsonElement<List<String>>(it) },
        receiptEmail = rawObject["receipt_email"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptor = rawObject["statement_descriptor"]?.let { json.decodeFromJsonElement<String>(it) },
        statementDescriptorSuffix = rawObject["statement_descriptor_suffix"]?.let { json.decodeFromJsonElement<String>(it) },
        transferData = rawObject["transfer_data"]?.let { json.decodeFromJsonElement<InlineV1ChargesCapturePostRequestFormTransferDataXfba3c867>(it) },
        transferGroup = rawObject["transfer_group"]?.let { json.decodeFromJsonElement<String>(it) },
      )
    }

    override fun serialize(encoder: Encoder, `value`: InlineV1ChargesCapturePostRequestFormXf632138c) {
      val jsonEncoder = encoder.requireJsonEncoder("InlineV1ChargesCapturePostRequestFormXf632138c")
      val json = jsonEncoder.json
      val raw = buildJsonObject {
        value.amount?.let { put("amount", json.encodeToJsonElement(it)) }
        value.applicationFee?.let { put("application_fee", json.encodeToJsonElement(it)) }
        value.applicationFeeAmount?.let { put("application_fee_amount", json.encodeToJsonElement(it)) }
        value.expand?.let { put("expand", json.encodeToJsonElement(it)) }
        value.receiptEmail?.let { put("receipt_email", it) }
        value.statementDescriptor?.let { put("statement_descriptor", it) }
        value.statementDescriptorSuffix?.let { put("statement_descriptor_suffix", it) }
        value.transferData?.let { put("transfer_data", json.encodeToJsonElement(it)) }
        value.transferGroup?.let { put("transfer_group", it) }
      }
      jsonEncoder.encodeJsonElement(raw)
    }
  }
}

public fun inlineV1ChargesCapturePostRequestFormXf632138c(block: InlineV1ChargesCapturePostRequestFormXf632138c.Builder.() -> Unit): InlineV1ChargesCapturePostRequestFormXf632138c = InlineV1ChargesCapturePostRequestFormXf632138c.build(block)
